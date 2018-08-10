package problems;

import java.util.Scanner;
public class Translation {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String inputTwo = sc.next();
		String reverse = new StringBuilder(new String(inputTwo)).reverse().toString();
		if (reverse.equals(input)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		sc.close();
	}
}
