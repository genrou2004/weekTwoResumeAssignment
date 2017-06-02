package roboResumeAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Job {

	
	Scanner scan = new Scanner(System.in);
	
	private int counter = 0;
	private String skill_with_rating;
	
	ArrayList<String> listOfSkillSet = new ArrayList<String>();
	
	public void skillSet(){
		System.out.println("Enter your Skill Set MAX 20: use STOP to EXIT");
		counter = 0;
		do {
			skill_with_rating = scan.nextLine();
			listOfSkillSet.add(skill_with_rating);
			counter++;
		} while (!skill_with_rating.equalsIgnoreCase("Stop") && counter < 20);
	}
}
