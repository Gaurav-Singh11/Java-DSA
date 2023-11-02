package basics;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
//		short firstNumber = 5;
//		int secondNumber = 10;
//		
//		long sum = firstNumber + secondNumber;
//		
//		System.out.println(sum); 
		
		try (Scanner sc = new Scanner(System.in)) {
			int firstNumber = sc.nextInt();
			int secondNumber = sc.nextInt();		
			int sum = firstNumber + secondNumber;	
			System.out.println(sum); 
		}

	}

}
