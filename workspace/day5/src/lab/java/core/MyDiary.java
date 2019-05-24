package lab.java.core;

public class MyDiary {
	private String title;
	private int month;
	private int day;
	private String desc;
	
	public MyDiary(String title, int month, int day) {
		this.title = title;
		this.month = month;
		this.day = day;
	}
	
	public MyDiary(String title, int month, int day, String desc) {
		this(title, month, day);
		this.desc = desc;
	}
	
	public String getTitle() 			{ return title; }
	public void setTitle(String title) 	{ this.title = title; }
	public int getMonth() 				{ return month; }
	public void setMonth(int month) 	{ this.month = month; }
	public int getDay() 				{ return day; }
	public void setDay(int day) 		{ this.day = day; }
	public String getDesc()				{ return desc; }
	public void setDesc(String desc) 	{ this.desc = desc; }
	
}
