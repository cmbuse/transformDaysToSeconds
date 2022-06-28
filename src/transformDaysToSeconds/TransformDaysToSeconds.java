package transformDaysToSeconds;

import java.util.Scanner;

public class TransformDaysToSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				System.out.print("Insert the numer of days: ");
				int days = scan.nextInt();
				
				int hours = days* 24;
				int minuts = hours* 60;
				int seconds = minuts* 60;
				System.out.print("The numer of seconds coresponding to your input is: "+ seconds);
				
				scan.close();
			}

		

	}


