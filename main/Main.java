package main;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter choice: (1. Seconds / 2. HMS): ");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1: seconds_calculation(); break;
			case 2: hours_calculation(); break;
			default: System.out.println("Wrong Input. Choose 1 or 2."); break;
				
		}
		scanner.close();
	}
		
	
	static void seconds_calculation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Seconds: ");
		float sec = scanner.nextFloat();
		
		float h = 0f;
		float m = 0f;
		float s = 0f;
		
		h = sec / 3600;
		m = (sec % 3600) / 60;
	        s = sec % 60;
	    
		System.out.printf("%.2f Hours | %.2f Minutes | %.2f Seconds", h, m, s);
		
		scanner.close();
   }
	
   static void hours_calculation() {
	   Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Hours: ");
		float hours = scanner.nextFloat();
		System.out.println("Enter Minutes: ");
		float minutes = scanner.nextFloat();
		System.out.println("Enter Seconds: ");
		float seconds = scanner.nextFloat();
		
		float total = (hours*3600) + (minutes*60) + seconds;
	    
		System.out.printf("%.2f Seconds in total.", total);
		
		scanner.close();
   }

}
