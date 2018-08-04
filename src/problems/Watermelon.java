package problems;

import java.util.Scanner;

public class Watermelon {
//accepted
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		if(inputNumber>=1 && inputNumber<=100){
		if(inputNumber%2 == 0 && inputNumber>2){
			System.out.println("YES");
			
		}else{
				System.out.println("NO");
			}
		}
		sc.close();
	
	}

}
