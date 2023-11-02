package basics;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			/// char input
			char name = sc.next().charAt(0);
			
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();
			
			int average = (m1 + m2 +m3)/3;
			
			System.out.println(name);

			System.out.println(average);
		}

	}

}
