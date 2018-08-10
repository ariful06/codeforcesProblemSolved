package problems;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
//accepted
		
		String input;
		Scanner in = new Scanner(System.in);
		input = in.next();
		String compare ="hello";
		int compareInt = 0;
		int counter = 0;
		char[] c = input.toCharArray();
		
		for(int i=0;i<c.length;i++){
			
			if(c[i] ==(char) compare.charAt(compareInt)){
				counter++;
				
				if(counter == 5){
					i = c.length;
				}
				compareInt++;
			}
		}
		if(counter ==5){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		in.close();
	}

}
