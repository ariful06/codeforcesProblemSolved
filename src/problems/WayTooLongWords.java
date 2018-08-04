package problems;


import java.util.Scanner;

public class WayTooLongWords {
//accepted on codeforce
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase  = sc.nextInt();
		
		for(int j = 0;j<testCase;j++){
			String inputString = sc.next();
			if(inputString.length()>10){
				char firstLetter = inputString.charAt(0);
				char lastLetter = inputString.charAt(inputString.length()-1);
				System.out.println(firstLetter+""+(inputString.length()-2)+lastLetter);
			}else{
				System.out.println(inputString);
			}
		}
		sc.close();	
	}
}
