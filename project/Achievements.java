package project;
import java.util.*;
import java.io.*;
public class Achievements extends Student {

	public void getAchievements() throws Exception {
	System.out.println("-----Achievements-----");
	System.out.println("1.Hacktoberfest");
	System.out.println("2.Sports");
	System.out.println("3.Google Summer of Code");
	System.out.println("4.Inter College Competetions");
	Scanner s = new Scanner(System.in);
	int option = s.nextInt();
	switch(option) {
	
	case 1 :
		System.out.println("1.Add");
		System.out.println("2.Show");
		int a = s.nextInt();
		Hacktoberfest hf = new Hacktoberfest();
		if(a==1) {
			hf.addHacks(name);
		}
		if(a==2) {
		
		hf.showHacks();
		}
	
	case 4:
		System.out.println("1.Add");
		System.out.println("2.Show");
		int b = s.nextInt();
		 InterCollegePrizes icp = new InterCollegePrizes(); 
		if(b==1) {
			icp.addPrize(name);
		}
		if(b==2) {
			icp.showPrizes();
		}
	case 2:
		
		
		
	
}
}
}