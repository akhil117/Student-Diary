package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Robotsavam {

	
	
			
			public ArrayList<String> al = new ArrayList<String>();
			public void show()
			{
				int a;
				do
				{
				System.out.println("RoboFighting");
				System.out.println("RobopartAnalysis");
				System.out.println("RoboticModelling");
				System.out.println("RoboSimulationTechnology");
				System.out.println("Press 5 For Exit");
				Scanner sc = new Scanner(System.in);
				 a = sc.nextInt();
				if(a==5)
				{
					return;
				}
				}while(a!=5);
			}
			public void selection( String name)
			{
				System.out.println("RoboFighting");
			System.out.println("RobopartAnalysis");
			System.out.println("RoboticModelling");
			System.out.println("RoboSimulationTechnology");

					Scanner sc = new Scanner(System.in);
					int a = sc.nextInt(); 
					if(a==1)
					{
					String s =name+ " RoboFighting";
					al.add(s);
					try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RoboFightingParticipants.ser"));
					
						out.writeObject(al);
					
					out.close();

					ObjectInputStream in = new ObjectInputStream(new FileInputStream("RoboFightParticipants.ser"));
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
					String s =name+ " RobopartAnalysis";
					al.add(s);
					try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("  RobopartAnalysisParticipants.ser"));
					
						out.writeObject(al);
					
					out.close();

					ObjectInputStream in = new ObjectInputStream(new FileInputStream("  RobopartAnalysisParticipants.ser"));
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
					String s =name+ " RoboticModelling";
					al.add(s);
					try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RoboticModellingParticipants.ser"));
					
						out.writeObject(al);
					
					out.close();

					ObjectInputStream in = new ObjectInputStream(new FileInputStream("RoboticModellingParticipants.ser"));
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
					String s =name+ " RoboSimulationTechnology";
					al.add(s);
					try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RoboSimulationTechnology.ser"));
					
						out.writeObject(al);
					
					out.close();

					ObjectInputStream in = new ObjectInputStream(new FileInputStream("RoboSimulationTechnology.ser"));
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
