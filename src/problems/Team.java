package problems;

import java.util.Scanner;

public class Team {
//accepted
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sureSolution= 0;
		int givenProblems = sc.nextInt();
		
		for(int i =0;i<givenProblems;i++){
			int Petya = sc.nextInt();
			int Vasya  = sc.nextInt();
			int Tonya  = sc.nextInt();
			
			if((Petya ==1 || Petya ==0) &&(Vasya ==1 || Vasya ==0) && (Tonya ==1 || Tonya ==0)){
				if( (Petya ==1 && Vasya == 1)  || (Petya ==1 && Tonya ==1) || (Vasya ==1 && Tonya ==1) ){
					sureSolution++;
				}
			}
		}
		
		System.out.println(sureSolution);
		
		sc.close();
	}
}
