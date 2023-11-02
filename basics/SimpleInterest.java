package basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int principle = sc.nextInt();
			int rateOfInterest = sc.nextInt();
			int time = sc.nextInt();
			int simpleInterest = (principle * rateOfInterest * time) / 100;
			System.out.println(simpleInterest);
			
		}
		
	}

}
