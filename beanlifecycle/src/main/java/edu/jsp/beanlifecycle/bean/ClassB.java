package edu.jsp.beanlifecycle.bean;

public class ClassB 
{
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+"object is created ");
	}
	
	public void myownInti()
	{
		System.out.println("Intialaizng call back method ");
	}
	
	public void distroyed()
	{
		System.out.println("distroyed call back method ");
	}
}
