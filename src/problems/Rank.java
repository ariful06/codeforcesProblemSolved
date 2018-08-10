package problems;


import java.util.Scanner;

public class Rank {

	public void sort(int arr[]){
		int n = arr.length;
		int temp=0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                	temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                }
            }
        }
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rank obj = new Rank();
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		int[] numbers = new int[4];
		int[] results = new int[testCase];
		int total = 0;
		int thomas = 0;
		for(int i=0;i<testCase;i++)
		{
			for(int j=0;j<numbers.length;j++){
				if(i ==0){
					numbers[j] = in.nextInt();
					thomas = thomas+numbers[j];
				}else{
					numbers[j] = in.nextInt();
					total = total + numbers[j];	
				}
				
				
			}
			results[i] = total;
			total = 0;
		}
	
		obj.sort(results);
		int count =1;
		for(int i =0 ;i<results.length;i++){
			if(thomas < results[i]){
				count++;
			}
		}
		System.out.println(count);
	
		in.close();
	}

}
