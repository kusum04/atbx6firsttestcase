package ex_27042024;

import java.util.Scanner;

public class Lab096 {

		public static void main(String[] args) {
			
			//leap year
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a year");
			int year = sc.nextInt();
			
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )) {
				
				System.out.println("Leap Year!!");
				
				
			}else {
				System.out.println("Not a leap year");
			}
			
			
			
		}
}
