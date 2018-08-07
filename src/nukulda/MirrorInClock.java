package nukulda;

import java.util.Scanner;
public class MirrorInClock {
	public static void main(String[] args) {
	//accepted
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		if(time.length()<5 && time.length() <4  ){
			System.out.println("Invalid Time input");
		}
		else{
			String[] splitedTime = time.split(":");
			//complete hou nai pore bosbo 
			int hours = Integer.parseInt(splitedTime[0]);
			int minutes = Integer.parseInt(splitedTime[1]);
			
			if(splitedTime[0].equals("12") && splitedTime[1].equals("00")){
				System.out.println(splitedTime[0]+":"+splitedTime[1]);
				sc.close();
				return;
			}else if(splitedTime[0].equals("6") && splitedTime[1].equals("00")){
				System.out.println(splitedTime[0]+":"+splitedTime[1]);
				sc.close();
				return;
			}else if(hours<0 && hours > 24 && minutes >60 && minutes <0){
				System.out.println("Invalid time");
			}else{
				if(hours>12){
					int daylight = hours-12;
					if(11-daylight==0){
						System.out.println("12"+":"+(60-minutes));	
					}else{
						System.out.println((11-daylight)+":"+(60-minutes));	
					}
					
				}else{
					if(11-hours==0){
						System.out.println("12"+":"+(60-minutes));	
					}else{
						System.out.println((11-hours)+":"+(60-minutes));
					}
					
				}	
			}
		}
		sc.close();
	}
}
