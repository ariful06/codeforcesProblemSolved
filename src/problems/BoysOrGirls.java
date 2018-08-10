package problems;

import java.util.Scanner;

public class BoysOrGirls {

	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();		
		boolean isMatched=false;
		int counter = 0,counterOne =0;
		String temp="";
	    System.out.println("The unique characters are-");

	    
	   char[] a = userName.toCharArray();
	   char[] b = new char[a.length]; 
	   for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[i]==a[j]){
	            	isMatched = true;
	            	counter++;
	            }else{
	            	isMatched = false;
	            }
	        }
	        
	        
	        
	    }   
	    System.out.println(counter);
	    System.out.println(counterOne);
	}
}
