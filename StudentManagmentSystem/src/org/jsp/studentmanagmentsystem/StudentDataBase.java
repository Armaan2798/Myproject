package org.jsp.studentmanagmentsystem;

import java.util.*;
import java.util.Scanner;

public class StudentDataBase {
	private List<Student> l;	
	private Scanner sc ;
	
	public StudentDataBase(List<Student> l, Scanner sc) 
	{	
		this.l = l;
		this.sc = sc;
	}

	public void addStudent()
	{
		sc.nextLine();
		Student s = readStudDetails();
		l.add(s);
	}
	
	public Student readStudDetails()
	{
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		
		System.out.println("Enter the mobile");
		long mobile = sc.nextLong();
		
		return new Student(name, id, marks, mobile);
	}
	
	public void searchStudent()
	{ 
		 //   Student s = readStudDetails();
	     if(!l.isEmpty())
				{ 
			      System.out.println("Enter the id to be search"); 
			      int id=sc.nextInt();
			      for(int i=0;i<l.size();i++)
			      {
			    	  if(l.get(i).getId()==id)
			    	  {
			    		  System.out.println("student id is found at "+i);
			    		  return;
			    	  }
			      }
			      System.out.println("Student with id = "+id+" doesn't found");
			     }
	     else
	     {
	    	 System.out.println("The list is empty");
	     }
	}
	
	public void removeStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be search"); 
		      int id=sc.nextInt();
		      for(int i=0;i<l.size();i++)
		      {
		    	  if(l.get(i).getId()==id)
		    	  {
		    		  l.remove(i);
		    		  dispStudent();
		    		  return;
		    		  
		    	  }
		      }
		      System.out.println("Student with id = "+id+" doesn't found");
		     
		}
		else
		{
			System.out.println("list is empty");
		}
		
	}
	
	public void updateStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("1.Marks ?\n2.Mobile ?"); 
			System.out.println("Enter your choice");
		      int ch=sc.nextInt();
		      if(ch==1)
		      {
		    	  System.out.println("Enter the id update the marks");
		    	  int id=sc.nextInt();
		    	  for(int i=0;i<l.size();i++)
		    	  {
		    		  if(l.get(i).getId()==id)
		    		  {
		    			  System.out.println("Enter new  the marks");
		    			  double newMarks=sc.nextDouble();
		    			  l.get(i).setMarks(newMarks);
		    			  dispStudent();
							return;
		    		  }
		    	  }
		    	  System.out.println("student with id ="+"dosen't found");
		      }
		      else if(ch==2)
		      {
		    	  System.out.println("Enter the id to update Mobile");
		    	  int id=sc.nextInt();
		    	  for(int i=0;i<l.size();i++)
		    	  {
		    		  System.out.println("Enter the new Mobile");
		    		  long newMobile=sc.nextLong();
		    		  l.get(i).setMobile(newMobile);
		    		  dispStudent();
						return;
		    		  
		    	  }
		    	  System.out.println("student with id ="+"dosen't found");
		      }
		      else
		      {
		    	  System.out.println("Invalid choice");
		      }
		     
		}
	}
	
	public void dispStudent()
	{
		if(!l.isEmpty())
		{
			System.out.println("Name\t\tId\t\tMarks\t\tMobile");
			System.out.println("----------------------------------------------------------------");			
			for(int i = 0 ; i < l.size(); i++)
			{
				System.out.println(l.get(i));
			}
		}
		else
		{
			System.out.println("List is empty nothing to display");
		}
	}
	
	public void sortStudent()
	{
		if(!l.isEmpty())
		{
			 System.out.println("Enter the marks to search");
	    	  double marks=sc.nextDouble();
	    	  
	    	  for(int i=0;i<l.size();i++)
	    	  {
	    		  if(l.get(i).getMarks()>60)
	    		  {
	    			 // System.out.println(l.get(i));
	    			  dispStudent();
	    		  }
	    	  }
	    	  System.out.println("student with id ="+"dosen't found");
		}
	}
	
	
}
