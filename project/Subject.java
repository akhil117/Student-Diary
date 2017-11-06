package project;

public class Subject {

	private String subjectname;
	private String courseCode;
	private int credit;
	private String semester;
	
	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public String getSubjectname() {
		return subjectname;
	}


	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public int getCredit() {
		return credit;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	Subject()
	{
		this.subjectname = "unknown";
		this.courseCode="annonymous";
		this.credit = 0;
		semester = "null";
	}
	

	Subject(String subjectname,String coursecode,int credit,String semester)
	{
		this.subjectname = subjectname;
		this.semester = semester;
		this.courseCode = coursecode;
		this.credit = credit;
	}
	
	
	
	
}
