package roboResumeAssignment;

import java.util.Scanner;

public class RoboResumeAssignment {

	public static void main(String[] args) {
		// Variable declaration
		String name;
		String email;
		Scanner scan = new Scanner(System.in);
		
		Resume resume = new Resume();
		Job job = new Job();

		System.out.println("Enter your name: ");
		name = scan.nextLine();
		

		System.out.println("Enter your email: ");
		email = scan.nextLine();
		while (!EmailValidation.validate(email)) // calls the email validation method
		{
			System.out.println("please Enter a valid Email!");
			email = scan.nextLine();
		}
		resume.educationalAchivement();
		resume.workExperiance();
		job.skillSet();
		
		System.out.println("=============================================================");
		System.out.println(name);
		System.out.println(email);
		System.out.println();
		System.out.println("EDUCATION:");

		for (String edu : resume.listOfEducationalAchi) {
			if (!edu.equalsIgnoreCase("stop")) {
				System.out.println(edu);
			}
		}
		System.out.println();
		System.out.println("EXPERIANCE:");

		for (String exp : resume.listOfWorkExperiance) {
			if (!exp.equalsIgnoreCase("stop")) {
				System.out.println(exp);
			}
		}
		System.out.println();
		System.out.println("SKILL SETS:");
		for (String skill : job.listOfSkillSet) {
			if (!skill.equalsIgnoreCase("stop")) {
				System.out.println(skill);
			}
		}

		scan.close();
	}

}
