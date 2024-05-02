package ex_27042024;

import java.util.Scanner;

public class Lab094 {
	
	public static void main(String[] args) {
		
		
		//Program to check if a number is Positive, negative, or Zero
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number!");
		
		int num = sc.nextInt();
		
		if(num> 0) {
			
			System.out.println("Positive number!");
			
		}else if(num< 0) {
			System.out.println("Negative Number!!");
			
			
		}else {
			System.out.println("Zero");
		}
		
		sc.close();
		
	}

}
