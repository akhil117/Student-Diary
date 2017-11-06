package project;
import java.util.*;
import java.io.*;
public class InterCollegePrizes {

	public void addPrize(String name) throws Exception {
		System.out.println("Kindly enter the category");
		System.out.println("1.Amritakalotsavam");
		System.out.println("2.Inter College Debate");
		System.out.println("3.Singing Shows");
		System.out.println("4. Dancing Shows");
		System.out.println("5.Painting Competitions");
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("InterCollegePrizes.ser"));
		ArrayList<String> al = new ArrayList<String>();
		al = (ArrayList)in.readObject();
		
		in.close();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("InterCollegePrizes.ser"));
		switch(i){
		
		case 1:
		
			System.out.println("Name of the event participated");
			String event = s.nextLine();
			System.out.println("Which prize did the student obtain?");
			String prize = s.nextLine();
			String line = name + "has participated in " + event +" and obtained " +prize+" prize";
			al.add(line);
			out.writeObject(al);
			break;
		case 2:
			System.out.println("Name of the debate participated");
			String event1 = s.nextLine();
			System.out.println("Which prize did the student obtain?");
			String prize1 = s.nextLine();
			String line1 = name + "has participated in " + event1 +" and obtained " +prize1+" prize";
			al.add(line1);
			out.writeObject(al);
			break;
		case 3:
			System.out.println("Name of the event participated");
			String event2 = s.nextLine();
			System.out.println("Which prize did the student obtain?");
			String prize2 = s.nextLine();
			String line2 = name + "has participated in " + event2 +" and obtained " +prize2+" prize";
			al.add(line2);
			out.writeObject(al);
			break;
		case 4:
			System.out.println("Name of the event participated");
			String event3 = s.nextLine();
			System.out.println("Which prize did the student obtain?");
			String prize3 = s.nextLine();
			String line3 = name + "has participated in " + event3 +" and obtained " +prize3+" prize";
			al.add(line3);
			out.writeObject(al);
			break;
		case 5:
			System.out.println("Name of the event participated");
			String event4 = s.nextLine();
			System.out.println("Which prize did the student obtain?");
			String prize4 = s.nextLine();
			String line4 = name + "has participated in " + event4 +" and obtained " +prize4+" prize";
			al.add(line4);
			out.writeObject(al);
			break;
		default:
			System.out.println("Enter the proper option");
			break;
		}
	}
	public void showPrizes() throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("InterCollegePrizes.ser"));
		ArrayList<String> al = new ArrayList<String>();
		al = (ArrayList)in.readObject();
		for(String st:al)
		{
			System.out.println(st);
		}
		in.close();
	}
}