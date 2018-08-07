package nukulda;

import java.util.Scanner;

public class CharMath {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		String paragraph = sc.nextLine();
		char c = 'a';
		int counterOfC = 0;
		char[] converStringToCharArray = paragraph.toCharArray();
		for(int i=0;i<paragraph.length();i++){
			if(converStringToCharArray[i] ==c){
				counterOfC++;
			}
		}
		System.out.println(counterOfC);	
		sc.close();
	}
}
