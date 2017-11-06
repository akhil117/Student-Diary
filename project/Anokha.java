package project;
import java.util.*;
import java.io.*;

public class Anokha {
	
	public void show()
	{
		
		int a;
		do
		{
		System.out.println("1.)AmazonWebServices");
		System.out.println("2.)Networking");
		System.out.println("3.)DataMining");
		System.out.println("4.)MATLAB");
		System.out.println("5.)Press 5 for Exit");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a==5)
		{
			return;
		}
	}while(a!=5);
	}
public void selection(String name)
{

ArrayList<String> al = new ArrayList<String>(); 
	System.out.println("enter the option you want to select");
		System.out.println("1.)AmazonWebServices");
		System.out.println("2.)Networking");
		System.out.println("3.)DataMining");
		System.out.println("4.)MATLAB");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		if(a==1)
		{
		String s =name+ " AmazonWebServices";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("AmazonServicesParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("AmazonServicesParticipants.ser"));
		ArrayList<String> als = new ArrayList<String>();
		
		als = (ArrayList)in.readObject();
		
		for(String st:als)
		{
			System.out.println(st);
		}
		in.close();
		}catch(Exception e)
		{}
		}
		else if(a==2)
		{
		String s =name+ " Networking";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("NetworkingParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("NetworkingParticipants.ser"));
		ArrayList<String> als = new ArrayList<String>();
		
		als = (ArrayList)in.readObject();
		
		for(String st:als)
		{
			System.out.println(st);
		}
		in.close();
		}catch(Exception e)
		{}
		}
		
		else if(a==3)
		{
		String s =name+ " DataMining";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DataMiningParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("NetworkingParticipants.ser"));
		ArrayList<String> als = new ArrayList<String>();
		
		als = (ArrayList)in.readObject();
		
		for(String st:als)
		{
			System.out.println(st);
		}
		in.close();
		}catch(Exception e)
		{}
		}
		
		
		else
		{
		String s =name+ " MATLAB";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("MATLABParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("MATLABParticipants.ser"));
		ArrayList<String> als = new ArrayList<String>();
		
		als = (ArrayList)in.readObject();
		
		for(String st:als)
		{
			System.out.println(st);
		}
		in.close();
		}catch(Exception e)
		{}
		}
		
		

}

}
