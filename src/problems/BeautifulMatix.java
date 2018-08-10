package problems;

import java.util.Scanner;

public class BeautifulMatix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int row =5, col = 5;
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < row; i++)
         {
             for (int j = 0; j < col; j++)
             {
                 arr[i][j] = sc.nextInt();
             }
         }
		
		int tempi = 0,tempj=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(arr[i][j] == 1){
					tempi =  i;
					tempj = j;
				}
			}
		}
		
		
		System.out.println((Math.abs(2-tempi)) + (Math.abs(2-tempj)));
		
		sc.close();
	}
}
