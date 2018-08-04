package problems;

import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X = 0;
		
		Scanner sc = new Scanner(System.in);
		int numOfStatements = sc.nextInt();
		
		for(int i=0;i<numOfStatements; i++){
			String statement = sc.next();
			if(statement.length()==3){
				if(statement.contains("++")){
					X++;
				}else if(statement.contains("--")){
					X--;
				}
			}
			
		}
		System.out.println(X);
		
		sc.close();
	}

}
