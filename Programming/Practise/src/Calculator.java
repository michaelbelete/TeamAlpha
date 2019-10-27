// simple console based calculator with java
// @author Eyob Alemu

import java.util.Scanner;
	

public class Calculator{
	
	private static double result; // Holds every computation result
    private static double input; // accepts values to be computed
    private static boolean repeat = true; // weather to continue or not
    private static Scanner sc = new Scanner(System.in);
	
	private static void acceptInput(String message, String operation) {
        // 'message' is info about what the user should insert
        // 'operation' is the type of computation chosen by the user

        System.out.printf("======[%s]======\n", operation);
        System.out.printf("Enter %s...: ", message);
        input = sc.nextDouble();
        System.out.println();
    }
	
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

