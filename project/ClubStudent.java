package project;

public class ClubStudent extends Student implements ClubAttendance
{
	private String Clubid;
	Student student = new Student();
	final Attendancemain a = new Attendancemain();
	
	public ClubStudent()
	{
		
	}

	public ClubStudent(String id)
	{
		super();
		this.Clubid = id;
	}


	public void getClubAttendance(Student obj)
	{
		//a.AttendanceChecker(obj);
	}

	
	public static ClubStudent convertToClub(Student st){
		ClubStudent s = new ClubStudent();
		s.name = st.name;
		s.rollno = st.rollno;
		s.mother = st.mother;
		s.father = st.father;
		s.date = st.date;
		s.year = st.year;
		s.BloodGroup = st.BloodGroup;
		s.Address = st.Address;
		s.presentSemester = st.presentSemester;
		s.Attend = st.Attend();
		s.id= st.id;
		
		
		return s;
	}
	public String getClubid() {
		return Clubid;
	}


	public void setClubid(String clubid) {
		Clubid = clubid;
	}
}
