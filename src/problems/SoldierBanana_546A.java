package problems;

import java.util.Scanner;

public class SoldierBanana_546A {

	public static void main(String[] args) {
		// accepted
		Scanner sc = new Scanner(System.in);
		int costPerBanana = sc.nextInt();
		int ifNoNeedToBorrow = 0;
		int dollarSoldierHave = sc.nextInt();
		int quantity = sc.nextInt();
		int totalCost = 0;
		for (int i = 1; i <= quantity; i++) {
			totalCost = totalCost+(costPerBanana*i);
		}
		
		if(totalCost>dollarSoldierHave){
			System.out.println(totalCost-dollarSoldierHave);
		}else{
		System.out.println(ifNoNeedToBorrow);
		}
		sc.close();
	}

}
