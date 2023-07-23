package edu.jsp.autowiringusingusingannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassA 
{
	@Autowired //wiring on  variable
  private ClassB b;
  

  public ClassA()
  {
	  System.out.println(this.getClass().getSimpleName()+"object is created using no-arg contrustor... ");
	  

  }
//  @Autowired //wiring using arg constrotor
public ClassA(ClassB b) {
	super();
	System.out.println(this.getClass().getSimpleName()+"object is created using arg contrustor... ");
	  
	
	this.b = b;
}

public ClassB getB() {
	return b;
}

//@Autowired //wiring using on setter
public void setB(ClassB b) {
	this.b = b;
}

@Override
public String toString() {
	return "ClassA [b=" + b + "]";
}
  
}
