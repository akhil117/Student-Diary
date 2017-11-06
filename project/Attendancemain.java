package project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Attendancemain extends Student
{

	String s= "invalid";

	public String getMinAttendance(Student obj)
	{

		if(obj.id()=="normal")
		{
			s = "The Minimum Attendance required is 75%";
		}

		else if(obj.id() == "honor")
		{
			s = "The Minimum Attendance required is 20%";
		}


		else if(obj.id()=="club")
		{
			s = "The Minimum Attendance required is 25%";
		}
		return s;
	}



	public void AttendanceChecker(String name)
	{
		
		
				try
				{
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studentsdata.ser"));
					ArrayList<Student> al = new ArrayList<Student>();
					al = (ArrayList<Student>)in.readObject();
					for(Student akhil : al)
					{
						if(akhil.name == name)
						{
							System.out.println(akhil.Attend());
						}
					}








	}catch(Exception e)
				{
					System.out.println(e);
				}








}
}
