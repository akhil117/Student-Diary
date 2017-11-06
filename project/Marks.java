package project;
import java.util.*;
public class Marks extends Student implements StudentMarks {
	
	

	public void viewInternalmarks()
	{
		
		int min = 0;
		int max = 50;
		Random r = new Random();
		double b = r.nextInt((max - min) + 1) + min;
		System.out.println(b);
	}
	
	public void viewEndsemmarks()
	{

		int min = 0;
		int max = 100;
		Random r = new Random();
		double b = r.nextInt((max - min) + 1) + min;
		System.out.println(b);	
	}
	
	public void viewContinuousEvaluation()
	
	{
		int min = 0;
		int max = 20;
		Random r = new Random();
		double b = r.nextInt((max - min) + 1) + min;
		System.out.println(b);	
	}
}
