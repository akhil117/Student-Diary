package project;



import java.io.*;


public class Student implements Details,Serializable{
	public String name;
	int rollno;
	String mother;
	String father;
	String date,month,year,BloodGroup,Address;
	String presentSemester;
	 String id;
	int Attend;
	
	public int Attend() {
		return Attend;
	}

	public void Attend(int attend) {
		Attend = attend;
	}

	public String id() {
		return id;
	}

	

	public Student()
	{
		this.name = "tinku";
		this.rollno = 49;
		this.mother = "tinkeswari";
		this.father = "tinkularaja";
		this.date = "14";
		this.month = "5";
		this.year = "1998";
		this.BloodGroup = "O-Positive"; 
		this.Address = "RajaDgreatStreet";
		this.presentSemester = "S3";
		this.Attend = 15;
		id = "normal";
	}
	
	public Student(String BloodGroup,int rollno,String name,String mother,String father,String date,String month,String year,String Address,String presentSemester,int Attend,String id)
	{
		this.rollno = rollno;
		this.name = name;
		
		this.mother = mother;
		this.father = father;
		this.date =date;
		this.month= month;
		this.year= year;
		this.BloodGroup = BloodGroup;
		this.Address = Address;
		this.presentSemester = presentSemester;
		this.Attend = Attend;
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	
	public int  getRollno()
	{
		return rollno;
	}
	
	
	public String getParents()
	{
		return ("The father name is"+father+" and mother name is "+mother);
	}
	
	
	public String getDOB()
	{
		return (date+"-"+month+"-"+year);
	}
	
	public String getBloodGroup()
	{
		return ("the blood group is"+BloodGroup);
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public String getSemester()
	{
		return presentSemester;
	}
	
	public String toString()
	{
		return ("Father:"+this.father+"\n "+"Mother:"+this.mother+"\n "+"Student Name:"+this.name+"\n "+"StudentRollno:"+this.rollno+"\n "+"StudentAdress:"+this.Address+"\n "+"StudentDOB:"+this.date+"-"+this.month+"-"+this.year+"\n "+"StudentBloodGroup:"+this.BloodGroup+"\n "+"present Semester:"+this.presentSemester+"\n"+"present attendance is"+this.Attend+"\n"+"his special id is"+ this.id);
	}
	public void StudentRegister()
	{
		StudentEvent a = new StudentEvent();
		this.name = name;
		a.show();
		a.selection(name);
	}
	
	
	
	
	
	
}
