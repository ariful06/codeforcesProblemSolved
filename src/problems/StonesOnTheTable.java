package problems;

import java.util.Scanner;

public class StonesOnTheTable {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		int totalLength = sc.nextInt();
		String input = sc.next();
		char[] ch =  input.toCharArray();
		int counter = 0;
		if(totalLength == ch.length){
			for(int i = 0; i<ch.length-1;i++){
				if(ch[i] == ch[i+1]){
					counter++;
				}
			}
			System.out.println(counter);
		}
		sc.close();
	}

}
