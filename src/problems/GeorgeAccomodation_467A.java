package problems;

import java.util.Scanner;

public class GeorgeAccomodation_467A {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int[][] num = new int[testCase][2];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < 2; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		int temp = 0;
		int counter = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(j ==0){
					temp = num[i][j];
				}else{
					if(num[i][j] - temp >= 2){
						counter++;
					}
				}
			}
			temp = 0;
		}
		System.out.println(counter);
		sc.close();
	}

}
