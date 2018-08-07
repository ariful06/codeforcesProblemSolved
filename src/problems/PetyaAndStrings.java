package problems;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.length() == str2.length()){
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			if(str1.equalsIgnoreCase(str2)){
				System.out.println("0");
				return;
			}
			
			for(int i = 0;i<str1.length();i++){
				if(str1.charAt(i) > str2.charAt(i)){
					System.out.println("1");
					return;
				}else if(str2.charAt(i)>str1.charAt(i)){
					System.out.println("-1");
					return;
				}
			}
		
		}
		sc.close();
	}
		
}
