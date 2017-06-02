package roboResumeAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Resume {
	
	private int counter =0;
	private String edu_achi;
	private String work_exp;
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String> listOfEducationalAchi = new ArrayList<String>();
	ArrayList<String> listOfWorkExperiance = new ArrayList<String>();
	
	
	
	public void educationalAchivement(){

		System.out.println("Enter Educational achivements MAX 10: use STOP to EXIT");
	do {
		edu_achi = scan.nextLine();
		listOfEducationalAchi.add(edu_achi);
		counter++;
	} while (!edu_achi.equalsIgnoreCase("Stop") && counter < 10);
	}
	
	public void workExperiance(){

	System.out.println("Enter your work Experiance MAX 10: use STOP to EXIT");
	counter = 0;
	do {
		work_exp = scan.nextLine();
		listOfWorkExperiance.add(work_exp);
		counter++;
	} while (!work_exp.equalsIgnoreCase("Stop") && counter < 10);
	}
}
