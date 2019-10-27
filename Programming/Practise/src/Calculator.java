// simple console based calculator with java
// @author Eyob Alemu

import java.util.Scanner;
	private static double result; // Holds every computation result
    private static double input; // accepts values to be computed
    private static boolean repeat = true; // weather to continue or not
    private static Scanner sc = new Scanner(System.in); 

public class Calculator{
    public static void main(String[] args){
		
      int choice;
      Scanner sc = new Scanner(System.in);
			
      do{
			
        System.out.println("[1] for trig");
        System.out.println("[2] for log"); 
        System.out.println("[3] quit");
        choice = sc.nextInt(); 
				
      }while(choice != 3);    
    }
}

