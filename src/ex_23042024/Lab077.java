package ex_23042024;

import java.util.Scanner;


public class Lab077 {

	public static void main(String[] args) {
	    //grade Calculator
		//Write a program that calculates and displays the letter grade for a given
		//numerical score (e.g: A, B, C, D, F)based on the following
		
		//grading scale;
		//A: 90-100
		//B: 80-89
		//C:70-79
		//D: 60-69
		//F:0-59

		
		//Three steps process
		//1 step:Find the user Inputs
		//Score-data type? -int
		//return -->Grade-->data type-->Char
		//DAA-Ask for the domfirmation of the doubts
		//Interviewer --> int, char
		
		//step2. Basic Logic
		//if (Score >= 90 && Score <= 100) --> return or print grade -A
		//else if (Score <= 89 && Score >= 80) --> return or print grade -B
		//else if (Score <= 70 && Score >= 79) --> return or print grade -C
		//else if (Score <= 60 && Score >= 69) --> return or print grade -D
		//else --> grade -->F
		
		//Write the code
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Score!!");
				int score = sc.nextInt();
		
		char grade = 'F';
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
			
		}
		
		else if(score >= 80 && score <= 89) {
			grade = 'B';
		}
		else if(score >= 70 && score <= 79) {
			grade = 'C';
		}
		else if(score >= 60 && score <= 70) {
			grade = 'D';
			
		}
		else if (score > 100) {
			
			System.out.println("LOL!!!, are you god?");
		}
		
		
		else {
			grade = 'F';
		}
		
		System.out.println(" your grade is --> " + grade);
		sc.close();

	}
				
}
