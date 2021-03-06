from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth.forms import UserCreationForm, AuthenticationForm, UserChangeForm, PasswordChangeForm
from django.contrib.auth import login as auth_login
from django.contrib.auth import logout as auth_logout
from django.contrib.auth import update_session_auth_hash
from django.contrib.auth import get_user_model
from IPython import embed
from .forms import UserCustomChangeForm, UserCustomCreationForm
from django.contrib.auth.decorators import login_required


# Create your views here.
# -----------------------------------------------------------------------------
# signup
# -----------------------------------------------------------------------------
def signup(request):
    if request.user.is_authenticated:
        return redirect('boards:index')

    if request.method == 'POST':
        # User model을 재설정해서 해당 폼을 사용할 수 없음
        # form = UserCreationForm(request.POST)
        # 새롭게 정의한 폼으로 변경
        form = UserCustomCreationForm(request.POST)
        #embed()
        if form.is_valid():
            user = form.save()
            auth_login(request, user)
            return redirect('boards:index')
    else:
        # form = UserCreationForm()
        form = UserCustomCreationForm()
        #embed()

    context = {
        'form': form,
        'label': '회원가입'
    }
    return render(request, 'accounts/signup.html', context)


# -----------------------------------------------------------------------------
# login
# -----------------------------------------------------------------------------
def login(request):
    if request.user.is_authenticated:
        return redirect('boards:index')

    if request.method == 'POST':
        form = AuthenticationForm(request, request.POST)
        if form.is_valid():
            auth_login(request, form.get_user())
            return redirect(request.GET.get('next') or 'boards:index')
    else:
        form = AuthenticationForm()

    context = {
        'form': form,
        'label': '로그인'
    }

    # return render(request, 'accounts/auth_form.html', context)
    return render(request, 'accounts/login.html', context)


# -----------------------------------------------------------------------------
# logout
# -----------------------------------------------------------------------------
@login_required
def logout(request):
    if request.method == 'POST':
        auth_logout(request)

    return redirect('boards:index')


# -----------------------------------------------------------------------------
# edit
# -----------------------------------------------------------------------------
@login_required
def edit(request):
    if request.method == 'POST':
        form = UserCustomChangeForm(request.POST, instance=request.user)
        if form.is_valid():
            form.save()
            return redirect('boards:index')
    else:
        form = UserCustomChangeForm(instance=request.user)

    context = {
        'form': form,
        'label': '회원 정보 수정'
    }

    return render(request, 'accounts/auth_form.html', context)


# -----------------------------------------------------------------------------
# chg_pwd
# -----------------------------------------------------------------------------
@login_required
def chg_pwd(request):

    if request.method == 'POST':
        form = PasswordChangeForm(request.user, request.POST)
        if form.is_valid():
            user = form.save()
            update_session_auth_hash(request, user)
            return redirect('accounts:edit')

    else:
        form = PasswordChangeForm(request.user)

    context = {
        'form': form,
        'label': '비밀번호 수정'
    }

    return render(request, 'accounts/auth_form.html', context)


# -----------------------------------------------------------------------------
# delete
# -----------------------------------------------------------------------------
@login_required
def delete(request):
    if request.method == 'POST':
        request.user.delete()

    return redirect('boards:index')


# -----------------------------------------------------------------------------
# follow
# -----------------------------------------------------------------------------
@login_required
def follow(request, u_id):
    person = get_object_or_404(get_user_model(), id=u_id)

    if person.followers.filter(id=request.user.id).exists():
        person.followers.remove(request.user)
    else:
        person.followers.add(request.user)

    return redirect('boards:index')
    

# -----------------------------------------------------------------------------
# profile
# -----------------------------------------------------------------------------
def profile(request, name):
    person = get_object_or_404(get_user_model(), username=name)
    context = {
        'person': person
    }
 
    return render(request, 'accounts/profile.html', context)