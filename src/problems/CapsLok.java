package problems;

import java.util.Scanner;

public class CapsLok {
public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
	int counter = 0,counterOne =0;
		String inputString = in.next();
		String[] a = inputString.split("");
		
       for(int i=0;i<a.length;i++)
        {
           if(a[i] == a[i].toUpperCase()){
      	   counter++;     	   
           }else{
        	   counterOne++;
        	   }
       }
       System.out.println(counter);
       System.out.println(counterOne);
		if(a.length == counter || ( a[0] == a[0].toLowerCase() &&counter == a.length-1)){
			for(int i=0;i<a.length;i++){
				if(a[i] == a[i].toLowerCase()){
					System.out.print(a[i].toUpperCase());
				}else{
					System.out.print(a[i].toLowerCase());
				}
			}
		}else {
			for(int i=0;i<a.length;i++){
					System.out.print(a[i]);
				}
		}
		in.close();
	}
}
