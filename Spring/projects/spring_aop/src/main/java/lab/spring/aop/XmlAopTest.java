package lab.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.spring.aop.persist.UserVO;
import lab.spring.aop.service.UserService;

public class XmlAopTest {

	public static void main(String[] args) {

		String[] configs = new String[] {"xmlAop.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(configs);
		
		UserService service = context.getBean("userService", UserService.class);
		UserVO vo = new UserVO();
		vo.setUserid("egov");
		vo.setUsername("전자정부");
		System.out.println("Target 객체의 핵심로직 수행: " + service.registMember(vo));
	}

}
