package edu.jsp.beanlifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//prgramatic way approch


public class ClassA implements InitializingBean,DisposableBean
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+"object is created no arg cons");
	}

	
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		//initialization code
		System.out.println("in post initialization callback method ");

	}
	@Override
	public void destroy() throws Exception 
	{
		//clean up code
		System.out.println(" in pre destruction callback method ");
				
	}

	
}
