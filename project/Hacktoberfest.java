package project;
import java.util.*;
import java.io.*;
public class Hacktoberfest {

	public void addHacks(String name) throws Exception  {
	System.out.print("Enter your Github ID:");
	Scanner s = new Scanner(System.in);
	String ID = s.nextLine();
	String hack = "Name: "+name + " ID: "+ ID;  
	
	
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("hacktoberfest.ser"));
	ArrayList<String> al = new ArrayList<String>();
	al = (ArrayList)in.readObject();
	
	
	
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hacktoberfest.ser"));
	//ArrayList<String> al = new ArrayList<String>(); 
	al.add(hack);
	out.writeObject(al);
	out.close();
	s.close();
	}
	public void showHacks() throws Exception { 
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("hacktoberfest.ser"));
	ArrayList<String> als = (ArrayList<String>)in.readObject();
	for(String st:als)
	{
		System.out.println(st);
	}
	in.close();
		
	}

	

}

