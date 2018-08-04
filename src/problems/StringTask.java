package problems;


import java.util.Scanner;
public class StringTask {
//accepted 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String convertedString = inputString.toLowerCase();
		String replaceString = convertedString.replaceAll("a","").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").replaceAll("y", "");
		char[] result = replaceString.toCharArray();
		for(int i=0;i<result.length;i++){
			System.out.print("."+result[i]);
		}
		sc.close();
	}

}
