package org.jsp.studentmanagmentsystem;

import java.util.*;
import java.util.Scanner;

public class StudentManagmentSystem {
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			
			StudentDataBase sdb = new StudentDataBase(new ArrayList<Student>(), sc);
			
			while(true)
			{
				System.out.println("1.Add\n2.Remove\n3.Search\n4.Update\n5.Display\n6.Sort\n7.Exit");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				
				switch(ch)
				{
					case 1: sdb.addStudent();
							break;
							
					case 2: sdb.removeStudent();
							break;
							
					case 3: sdb.searchStudent();
							break;
							
					case 4: sdb.updateStudent();
							break;
							
					case 5: sdb.dispStudent();
							break;
							
					case 6: sdb.sortStudent();
							break;
							
					case 7 : System.exit(0);
				}
			}
		}
	}

}
