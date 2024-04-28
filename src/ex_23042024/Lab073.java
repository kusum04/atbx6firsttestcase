package ex_23042024;

import java.util.Scanner;

public class Lab073 {

	public static void main(String[] args) {
		//Even and Odd Number
		//1-odd, 4 -even 
		//num%2 ==0 --> even      % is called as modulus(divided by and reminder)
		//else it is a odd
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("Even");
		}else{
			System.out.println("Odd");
			
			
		}
		sc.close();

	}

}
