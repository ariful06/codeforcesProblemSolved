package nukulda;

import java.util.Scanner;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		String paragraph = sc.nextLine();
		String wordToBeMatched = sc.next();
		String[] splitedString = paragraph.split("\\s+");
		for(int i = 0;i<splitedString.length;i++){
			if(splitedString[i].equalsIgnoreCase(wordToBeMatched)){
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
	}

}
