package patterns;

import java.util.Scanner;

public class NumberPattern2 {

	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int i = 1;
			int val = 1;
			while(i <= n) {
				int j = 1;
				while (j <= i) {
					System.out.print(val + " "); 
					j = j + 1;
					val = val + 1;
				}
				System.out.println();
				i = i + 1;
			}
		}

	}

}
