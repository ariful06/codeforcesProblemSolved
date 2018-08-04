package problems;

import java.util.Scanner;

public class Football {
//accepted
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// football	
		int countOne= 0;
		int countZero = 0;
	
	
		String inputString = sc.next();
			for(int i = 0;i<inputString.length();i++){
				if(inputString.charAt(i)=='0'){
					countOne =0;
					countZero++;
				}else{
					countZero = 0;
					countOne++;
				}
				
				if(countZero>=7 || countOne >=7){
					i = inputString.length();
				}
			}
			if(countOne>=7 || countZero>=7){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
	
	}

}
