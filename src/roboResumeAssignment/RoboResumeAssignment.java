package roboResumeAssignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoboResumeAssignment {
	
		//Email Pattern
		public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		    //Validates if the email is in a standard format
		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}

	public static void main(String[] args) {
//Variable declaration
		String name;
		String email;
		String edu_achi;
		String work_exp;
		String skill_with_rating;
		

		Scanner scan = new Scanner(System.in);
		//List of arrays for different inputs
		ArrayList<String> listOfEducationalAchi = new ArrayList<String>();
		ArrayList<String> listOfWorkExperiance = new ArrayList<String>();
		ArrayList<String> listOfSkillSet = new ArrayList<String>();
		
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		
		
		System.out.println("Enter your email: ");
		email = scan.nextLine();
		while(validate(email) == false) //calls the email validation method 
		{
			System.out.println("please Enter a valid Email!");
			email =scan.nextLine();
		}
			
		int counter = 0;
		System.out.println("Enter Educational achivements MAX 10: use STOP to EXIT");
		
		do{
			edu_achi =scan.nextLine();
			listOfEducationalAchi.add(edu_achi);
			counter++;
		}while(!edu_achi.equalsIgnoreCase("Stop") && counter <10);
		
		
		System.out.println("Enter your work Experiance MAX 10: use STOP to EXIT");
		counter=0;
		do{
			work_exp =scan.nextLine();
			listOfWorkExperiance.add(work_exp);
			counter++;
		}while(!work_exp.equalsIgnoreCase("Stop") && counter <10);
		
		System.out.println("Enter your Skill Set MAX 20: use STOP to EXIT");
		counter=0;
		do{
			skill_with_rating =scan.nextLine();
			listOfSkillSet.add(skill_with_rating);
			counter++;
		}while(!skill_with_rating.equalsIgnoreCase("Stop") && counter <20);
		
		System.out.println("=============================================================");
		System.out.println(name);
		System.out.println(email);
		System.out.println();
		System.out.println("EDUCATION:");

		for (String edu : listOfEducationalAchi) {
			if(!edu.equalsIgnoreCase("stop")){
			System.out.println(edu);
			}
			
		}
		System.out.println();
		System.out.println("EXPERIANCE:");
		
		for (String exp : listOfWorkExperiance) {
			if(!exp.equalsIgnoreCase("stop")){
			System.out.println(exp);
			}
		}
		System.out.println();
		System.out.println("SKILL SETS:");
		for (String skill : listOfSkillSet) {
			if(!skill.equalsIgnoreCase("stop")){
			System.out.println(skill);
			}
		}
		
		scan.close();
	}

}
