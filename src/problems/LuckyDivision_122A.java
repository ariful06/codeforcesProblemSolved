package problems;

import java.util.Scanner;

public class LuckyDivision_122A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int luckyDevisionNumber = sc.nextInt();
		char[] ch = String.valueOf(luckyDevisionNumber).toCharArray();
		int counter = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == '4' || ch[i]== '7'){
				counter++;
			}
		}
		if(ch.length == counter){
			System.out.println("YES");
		}else if(luckyDevisionNumber%4 ==0 || luckyDevisionNumber%7 ==0 ){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
