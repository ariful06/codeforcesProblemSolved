package problems;

import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[][] arr = new int[testCase][2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int tempValue = 0;
		int[][] temp = new int[testCase][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(j==0){
					temp[i][j] = tempValue - arr[i][j];
					tempValue = temp[i][j];
				}else{
					
					temp[i][j] = tempValue + arr[i][j]  ;
					tempValue = temp[i][j];
				}
			} 
		}

		int max = 0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j <2; j++) {
				if(temp[i][j]>max){
					max = temp[i][j];
				}
			}
		}
		System.out.print(max);
		sc.close();
		
	}

}
