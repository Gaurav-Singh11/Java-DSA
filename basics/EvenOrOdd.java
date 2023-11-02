package basics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			
			int rem = num % 2;
			
			if(rem == 0) {
				System.out.print("Even");
				return;
			}
			
			System.out.print("Odd");
		}
	}
}
