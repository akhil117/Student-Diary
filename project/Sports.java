package project;
import java.util.*;
import java.io.*;

public class Sports {
	
	
public void addSports(String name)
{
	//Taking prev data into array
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("FootballPlayers.ser"));
	ArrayList<String> al = new ArrayList<String>();
	al = (ArrayList)in.readObject();

	System.out.println("Enter the Sport participated in");
		System.out.println("1.)Cricket");
		System.out.println("2.)Football");
		System.out.println("3.)Running");
		System.out.println("4.)Relay");
		System.out.println("5.)Shotput");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		if(a==1)
		{
		String s =name+ " Cricket";
		al.add(s);
		}
					
		else if(a==2)
		{
		String s =name+ " Football";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FootballPlayers.ser"));
		
			out.writeObject(al);
		
		out.close();
		}catch(Exception e) {}
		}
		
		else if(a==3)
		{
		String s =name+ " Running";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RunningParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();
		}catch(Exception aer) {}
		}
		else if(a==4)
		{
		String s =name+ " Relay";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("RelayParticipants.ser"));
		
			out.writeObject(al);
		
		out.close();

		
		}catch(Exception e) {}
		}
				else if(a==5)
		{
		String s =name+ " ShotPut";
		al.add(s);
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ShotPut.ser"));
		
			out.writeObject(al);
		
		out.close();

		}catch(Exception e){}
		}		
		else {
			System.out.println("Kindly enter the proper option.");
		}
}

}