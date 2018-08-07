package problems;

import java.util.Scanner;

public class NextRound {
//accepted
	public static void main(String[] args) {
		int counterIfEqual=0;
		Scanner sc = new Scanner(System.in);
		int numberOfCadidade  = sc.nextInt();
		int kThScore = sc.nextInt();
		int[] totalCandidateArray = new int[numberOfCadidade];
		for(int i= 0;i<numberOfCadidade;i++){
			totalCandidateArray[i] = sc.nextInt();	
		}
		for(int i = 0;i<numberOfCadidade;i++){
			
			if(totalCandidateArray[i]>=totalCandidateArray[kThScore-1]){
				if(totalCandidateArray[i]>0){
					counterIfEqual++;
				}
			} 
		}
			System.out.println(counterIfEqual);

			sc.close();
	}
}
