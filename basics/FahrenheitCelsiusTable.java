package basics;

import java.util.Scanner;

public class FahrenheitCelsiusTable {

	public static void main(String[] args) {
//      Input 
//		0 100 20
//		Output
//		0	-17
//		20	-6
//		40	4
//		60	15
//		80	26
//		100	37
		try(Scanner sc = new Scanner(System.in);){
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			int step = sc.nextInt();
			
			int currentFahrenheitValue = start;
			
			while(currentFahrenheitValue <= end) {
				
				int celsiusValue = (int)((5.0 / 9) * (currentFahrenheitValue - 32));
				
				System.out.println(currentFahrenheitValue + "\t" + celsiusValue);
				
				currentFahrenheitValue += step;
				
			}
			
		}

	}

}
