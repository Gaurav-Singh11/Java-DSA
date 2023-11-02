package basics;

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		
		/// if input character is ‘A’(A-Z) output should be 1
		/// if input character is ‘a’(a-z) output should be 0 
		/// if input character is ‘*’(others) output should be -1
		
		try (Scanner sc = new Scanner(System.in)) {
			char ch = sc.next().charAt(0);
			if(ch >= 'A' && ch <= 'Z') {
				System.out.println(1);
			} else if(ch >= 'a' && ch <= 'z') {
				System.out.println(0);
			} else {
				System.out.println(-1); 
			}
		}
	}

}
