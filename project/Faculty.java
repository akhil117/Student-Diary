
package project;
import java.util.*;
import java.io.*;

public class Faculty extends Student implements Serializable {
	
	private String User;
	//private transient String pass;
	private String Department;
	
	Subject sub ;
	//Scanner sc = new Scanner(System.in);
	Event event = new Event();
	
	
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Faculty()
	{
		User = "unknown";
	
		Department = "CSE";
	}
	public Faculty(String User ,String Department)
	{
		this.User = User;
		this.Department = Department;
		
	}
	public String toString()
	{
		return "the faculty name: " +this.User+"\n"+"the department:"+this.Department;
	}
	public void AddStudent(String BloodGroup,int rollno,String name,String mother,String father,String date,String month,String year,String Address,String presentSemester,int Attend,String id)
	{
		try
		{
			ArrayList<Student> student = new ArrayList<Student>();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studentsdata.ser"));
		student = (ArrayList<Student>)in.readObject();
		in.close();
		
		Student stu = new Student( BloodGroup, rollno, name, mother, father, date, month, year, Address, presentSemester, Attend, id);
		student.add(stu);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void showStudents()
	{
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studentsdata.ser"));
			ArrayList<Student> s = new ArrayList<Student>();
			s = (ArrayList<Student>)in.readObject();
			for(Student p : s){
				System.out.println(p.name);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void addEvent(String item)
	{
		//String ne = sc.next();
		
		
		event.add(item);
		
	}
	public void ViewEvents()
	{
		StudentEvent a = new StudentEvent();
				a.show();
	}
	public void addSubjectDetails()
	{
		SubjectInput s = new SubjectInput();
		s.add();
	}
	
	public void AttendanceViewer(String name)
	{

		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studentsdata.ser"));
			ArrayList<Student> al = new ArrayList<Student>();
			al = (ArrayList<Student>)in.readObject();
			for(Student akhil : al)
			{
				String s = akhil.name;
				if(s.equals(name))
				
				{System.out.println();
				
				System.out.println("The Current Attendance "+akhil.Attend());
				System.out.println();
				System.out.println();
				}
			}
			in.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void AttendanceUpDate(String name)
	{
		
		AttendanceUpdate a = new AttendanceUpdate();
		a.Update(name);
		
	}
	
	
	

}
