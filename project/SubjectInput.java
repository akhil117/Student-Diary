package project;
import java.util.*;
import java.io.*;

public class SubjectInput {

	Scanner sc = new Scanner(System.in);
	ArrayList<Subject> a = new ArrayList<Subject>();
	public void add()

	{
		
		System.out.println("how many semester your are going to enter");
		int sems = sc.nextInt();
		System.out.println("enter the total subjects you are going to add");
		int total = sc.nextInt();
		for(int j=0;j<sems;j++)
		{
		for(int i=0;i<total;i++)
		{
		System.out.println("please enter the  which semester");
		String sem = sc.next();
		System.out.println("PLEASE ENTER THE SUBJECT");
		String sub = sc.next();
		System.out.println("enter the Cousrs code");
		String course  = sc.next();
		System.out.println("enter the credit of the subject");
		int  credit= sc.nextInt();
		}
		}
	}
	

}
