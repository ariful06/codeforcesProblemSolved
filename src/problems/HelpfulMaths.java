package problems;

import java.util.Scanner;

public class HelpfulMaths {

	public void sort(int array[]){
		
	}
	public void scanArray(int array[]){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpfulMaths obj = new HelpfulMaths();
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		for(int i = 0; i<100;i++){
			array[i] = sc.nextInt();
		}
		obj.sort(array);
		
	}

}
