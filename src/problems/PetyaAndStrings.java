package problems;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		// accepted
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		if(str1.length() == str2.length()){
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			if(str1.equalsIgnoreCase(str2)){
				System.out.println("0");
				in.close();
				return;
				
			}
			
			for(int i = 0;i<str1.length();i++){
				if(str1.charAt(i) > str2.charAt(i)){
					System.out.println("1");
					in.close();
					return;
				}else if(str2.charAt(i)>str1.charAt(i)){
					System.out.println("-1");
					in.close();
					return;
				}
			}
		
		}
		in.close();
	}
		
}
