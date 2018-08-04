package problems;

import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		String str1 =sc.next();
		char result = Character.toUpperCase(str1.charAt(0));
		char[] inputStringToChar = str1.toCharArray();
	
		for(int i=0;i<inputStringToChar.length;i++){
			if(i==0){
				inputStringToChar[0]= result;	
			}
			
			System.out.print(inputStringToChar[i]+"");
		}
		
	sc.close();	
	}
}
