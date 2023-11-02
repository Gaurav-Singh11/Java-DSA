package basics;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in);){
			
			int n = sc.nextInt();
			
			int evenSum = 0;
			int i = 0;
			
			while(i <= n) {
				evenSum = evenSum +i;
				i = i + 2;
			}
			
			System.out.println("Even sum===>" + evenSum);
			
			
			int oddSum = 0;
			int j = 1;
			
			while(j <= n) {
				oddSum = oddSum + j;
				j = j + 2;
			}
			
			System.out.println("Odd sum===>" + oddSum);
			
		}

	}

}
