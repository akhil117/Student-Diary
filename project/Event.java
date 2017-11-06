package project;
import java.io.*;
import java.util.*;
public class Event extends StudentEvent implements Serializable {
	
	String[] saved = new String[100];
	int i=0;
	//Scanner sc = new Scanner(System.in);
	ArrayList<String> wa = new ArrayList<String>();
	public String EventName;
	public String EventId;
	public Event()
	{
		EventName = "Unknown";
		EventId = "SomeThing";
	}
	
	public Event(String EventName , String EventId)
	{
		this.EventName = EventName;
		this.EventId = EventId;
				
	}
	
	public void add(String item)
	{
		int a;
		
			try
		{
			
		do{
			
		
			//FileReader file = new FileReader("events.txt");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("events.txt"));
			//ArrayList<String> wa = new ArrayList<String>();
			wa=(ArrayList<String>)in.readObject();
			in.close();
			//ArrayList<String> wa = new ArrayList<String>();
			wa.add(item);
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("events.txt"));
			/*PrintWriter w = new PrintWriter("events.txt");*/
			for(int i=0;i<wa.size();i++)
			{
			out.writeObject(wa);		
			}
			out.flush();
			out.close();
			System.out.println("Press 1 TO Exit after adding the item");
			a=1;
			if(a==1)
			{
				return ;
			}
		
			}while(a!=1);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	

}
