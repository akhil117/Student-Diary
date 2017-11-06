
package project;
import java.io.*;
import java.util.*;
public class AttendanceUpdate {
	
	
	public void Update(String name)
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studentsdata.ser"));
			ArrayList<Student> al = new ArrayList<Student>();
			al = (ArrayList<Student>)in.readObject();
			for(Student s : al)
			{
				
			
			if(name == s.name)
			{
				System.out.println("Update the attendance");
				Scanner sc = new Scanner(System.in);
				int attend = sc.nextInt();
				s.Attend = attend;
				
				
			}
			}
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Studentsdata.ser"));
			out.writeObject(al);
			out.flush();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
