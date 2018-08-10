package problems;

import java.util.Scanner;

public class YoungPhysicist_69A {
	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		int lineOfInput = sc.nextInt();
		int[][] values = new int[lineOfInput][3];
 		for (int i = 0; i < lineOfInput; i++) {
			for (int j = 0; j <3; j++) {
				values[i][j] =  sc.nextInt();
			}
		}
 		int x =0,y=0,z=0;
 		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 0){
					x = x + values[i][j];
				}else if(j==1){
					y = y+values[i][j];
				}else{
					z = z+values[i][j];
				}
			}
		}
 		if(x ==0 && y ==0 && z ==0){
 			System.out.println("YES");
 		}else{
 			System.out.println("NO");
 		}
		sc.close();
	}

}
