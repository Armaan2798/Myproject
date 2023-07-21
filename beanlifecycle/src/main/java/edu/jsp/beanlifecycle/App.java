package edu.jsp.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.beanlifecycle.bean.ClassA;
import edu.jsp.beanlifecycle.bean.ClassB;
import edu.jsp.beanlifecycle.bean.ClassC;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext con=
        		new ClassPathXmlApplicationContext("lifecycleconfig.xml");
               //  ClassA a1=(ClassA) con.getBean("classA");
                // System.out.println(a1);
                 //if coment con.close then destruction method not execute
                 ClassB a11=(ClassB) con.getBean("classB");
                 System.out.println(a11);
                 ClassC a12=(ClassC) con.getBean(ClassC.class);
                 System.out.println(a12);
                 con.close();
                 
    }
}
