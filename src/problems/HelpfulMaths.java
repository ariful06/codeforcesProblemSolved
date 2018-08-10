package problems;

import java.util.Scanner;

public class HelpfulMaths {

	public  void bubleSort(int arr[]){
		 int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	}
	public static void printArray(int array[]){
		
		int length = array.length;
		for(int i=0;i<length;i++){
			if(i== length-1){
				System.out.print(array[i]);
			}else{
			System.out.print(array[i]+"+");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpfulMaths obj = new HelpfulMaths();
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		try{
		String[] replacePluses = inputString.split("\\+");
		int[] numberArray = new int[replacePluses.length];
		for(int i = 0;i<replacePluses.length;i++){
			numberArray[i] = Integer.parseInt(replacePluses[i]);
		}
		
		 obj.bubleSort(numberArray);
		
		printArray(numberArray);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
