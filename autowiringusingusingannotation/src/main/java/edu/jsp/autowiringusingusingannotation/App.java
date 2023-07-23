package edu.jsp.autowiringusingusingannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.autowiringusingusingannotation.beans.ClassA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext con=
    			new ClassPathXmlApplicationContext("autowiringusingannotationconfig.xml");
    	ClassA a=(ClassA) con.getBean("classA");
    	System.out.println(a);
    	con.close();
    	
    }
}
