package project;
import java.io.*;
import java.util.*;


public class StudentEvent  {
	public int rollno;
	public String name;
	int count = 0;
	
	Student st = new Student();
	public ArrayList<String> data = new ArrayList<String>();
	public void show() {
		
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("events.txt"));
				ArrayList<String> s = new ArrayList<String>();
				s = (ArrayList<String>)in.readObject();
				for(String p : s){
					System.out.println(p.toString());
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		System.out.println("Please Select The Event Name In The option format");
		System.out.println("Please Select 4 for Exit");
		a = sc.nextInt();
		
		if(a==1)
		{
			
			Anokha ab = new Anokha();
			ab.show();
		}
		else if(a==3)
		{
			Robotsavam ab = new Robotsavam();
					ab.show();
		}
		else if(a==2)
		{
			Vidyut ab = new Vidyut();
			ab.show();
		}
		else if(a==4)
		{
			return;
		}
		else
		{
			System.out.println("You Have Enter Invalid Option");
		}
		}while(a!=4);
	}
	
	Scanner sc = new Scanner(System.in);

public void selection(String name)
{
	System.out.println("Please enter the choice of your selection wrt to option");
	
	int a = sc.nextInt();
	
if(a==1)
{
	count++;
	Anokha ab = new Anokha();

	
	
	ab.selection(name);

	  System.out.println();
}

else if(a==2)
{
	count++;
	Robotsavam ab = new Robotsavam();
	ab.selection(name);

	  System.out.println();
}
else if(a==3)
{count++;
	Vidyut ab = new Vidyut();
	ab.selection(name);
	  System.out.println();
}

else if(a==4)
{
	System.out.println("please wait for the updates the new events may come at any time :)");
}
else
{
	System.out.println("invalid error");
}


	
}

}
