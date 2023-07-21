package edu.jsp.beanlifecycle.bean;

import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class ClassC 
{
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+"object is created ");
	}

    
	public void myownInti()
	{
		System.out.println("Intialaizng call back method by using annotation");
	}
	
	
	public void distroyed()
	{
		System.out.println("distroyed call back method by using annotation ");
	}
}
