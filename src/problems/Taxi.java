package problems;

import java.util.Scanner;
import java.util.*;
public class Taxi {

	
	public static void main(String[] args) {
		//
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the test case number: ");
		int numberOfInputs = in.nextInt();
		int[] inputs = new int[numberOfInputs];
		
		int sumOfInputs = 0;
		
		for(int i=0;i<numberOfInputs;i++){
			inputs[i] = in.nextInt();
		}
		
		int length = inputs.length;
		int temp = 0;
		for(int i=0;i<length - 1;i++){
			for(int j = 0 ; j<length-i-1;j++){
				if(inputs[j] >inputs[j+1]){
					temp = inputs[j];
					inputs[j] = inputs[j+1];
					inputs[j+1] = temp;
				}
				
			}
		}
		
		int counter = 0;
		int t= 0;
		for(int i =0;i<length;i++){
			
			if(inputs[i]+inputs[i+1] < 4 )
			{
		
				
			}else{
				counter++;
				
			}
		}
		
//		System.out.println(counter);
		in.close();
	}
}
