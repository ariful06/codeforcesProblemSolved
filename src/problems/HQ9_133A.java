package problems;

import java.util.Scanner;

public class HQ9_133A {

	public static void main(String[] args) {
		//accepted
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(input.contains("H") || input.contains("Q") ||input.contains("9") ){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		sc.close();

	}

}
