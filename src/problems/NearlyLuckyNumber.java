package problems;

import java.math.BigInteger;
import java.util.Scanner;

public class NearlyLuckyNumber {

	public static void main(String[] args) {
		// TODO not completed
		Scanner sc = new Scanner(System.in);
		
		BigInteger bi = sc.nextBigInteger();
		String input = String.valueOf(bi);
		char[] ch = input.toCharArray();
		int counter = 0,counterSeven =0; 
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '4'){
				counter++;
			}
			if ( ch[i] == '7') {
				counterSeven ++;
			}
		}
	
		if ((counter+counterSeven) == ch.length  && counter >=1 && counterSeven >= 1 ) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		sc.close();
	}
}
