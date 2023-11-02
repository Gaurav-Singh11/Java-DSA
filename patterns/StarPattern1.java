package patterns;

import java.util.Scanner;

public class StarPattern1 {

    //    *
	//   ***
	//  *****
	// *******
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int i = 1;
			while (i <= n) {
				int space = 1;
				while (space <= n - i) {
					System.out.print(" ");
					space = space + 1;
				}
				int star = 1;
				while (star <= 2 * i - 1) {
					System.out.print("*"); 
					star = star + 1;
					
				}
				System.out.println();
				i = i + 1;
			}
		}

	}
}
