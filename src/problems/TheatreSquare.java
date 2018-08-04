package problems;

import java.util.Scanner;


public class TheatreSquare {
//accepted
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long m,n,a;
		m = sc.nextInt();
		n = sc.nextInt();
		a = sc.nextInt();
		
		 String sLong = Long.toUnsignedString(((m+(a-1))/a) * ((n+(a-1))/a));
		System.out.println(sLong);

	}

}
