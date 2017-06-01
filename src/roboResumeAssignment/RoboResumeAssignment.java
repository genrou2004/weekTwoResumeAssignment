package roboResumeAssignment;

import java.util.Scanner;

public class RoboResumeAssignment {

	public static void main(String[] args) {

		String name;
		String email;
		String[] edu_achi;
		String[] work_exp;
		String[] skill_with_rating;
		int num_achivements;
		int number_experiance;
		int number_skills;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name: ");
		name = scan.nextLine();
		System.out.println("Enter email: ");
		email = scan.nextLine();

		System.out.println("Enter the number of educational achivements (1 to 10)");
		num_achivements = scan.nextInt(); // read number of element
		// scan.nextInt(); // consume new line

		edu_achi = new String[num_achivements];
		System.out.println("Enter Educational achivements: ");
		for (int i = 0; i <edu_achi.length; i++) {
			
			edu_achi[i] = scan.nextLine();
			
		}

		System.out.println("Enter the number of experiance you have (1 to 10)");
		number_experiance = scan.nextInt();
		work_exp = new String[number_experiance];
		System.out.println("Enter your work Experiance: ");
		for (int j = 0; j < work_exp.length; j++) {
			work_exp[j] = scan.nextLine();
		}

		System.out.println("Enter your skills with rating (1 to 20)");
		number_skills = scan.nextInt();
		skill_with_rating = new String[number_skills];
		System.out.println("Enter your Skill Set: ");
		for (int k = 0; k < skill_with_rating.length; k++) {
			skill_with_rating[k] = scan.nextLine();
		}
		System.out.println("=============================================================");
		System.out.println(name);
		System.out.println(email);
		System.out.println();
		System.out.println("Education:");

		for (String achiv : edu_achi) {
			System.out.println(achiv);
		}
		System.out.println();
		System.out.println("Experiance:");
		
		for (String exp : work_exp) {
			System.out.println(exp);
		}
		System.out.println();
		System.out.println("Skills:");
		for (String skill : skill_with_rating) {
			System.out.println(skill);
		}
		

		scan.close();
	}

}
