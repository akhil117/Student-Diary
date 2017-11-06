package project;

public class HonorStudent extends Student implements HonorAttendance{


	final Attendancemain a = new Attendancemain();
	private String Honorid;
	Student student = new Student();
	public HonorStudent()
	{
		
	}


	public HonorStudent(String id)
	{
		super();
		this.Honorid = id;
	}

	public String getHonorid()
	{
		return Honorid;
	}
	
	public static HonorStudent convertToHonor(Student st){
		HonorStudent s = new HonorStudent();
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
		System.out.println(st.id);
		s.id= st.id;
		
		
		return s;
	}
	public void setHonorid(String id)
	{
		this.Honorid = id;
	}
	
	public void getHonorAttendance(HonorStudent obj)
	{
		Student obj1 = (Student)obj;
		//a.AttendanceChecker(obj1);
	}


}
	








