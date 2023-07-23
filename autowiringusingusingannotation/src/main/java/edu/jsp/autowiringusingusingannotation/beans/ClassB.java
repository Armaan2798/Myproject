package edu.jsp.autowiringusingusingannotation.beans;

public class ClassB 
{
  private int x;
  
  public ClassB()
  {
	  System.out.println(this.getClass().getSimpleName()+"object is created using no-arg contrustor... ");
	  
  }

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

@Override
public String toString() {
	return "ClassB [x=" + x + "]";
}
  
  
  
  
  
}
