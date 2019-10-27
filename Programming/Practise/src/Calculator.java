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
	
	private static void printAnswer(String message) {
        // 'message' is what has been computed

        System.out.printf("%s of %.2f is %.2f\n", message, input, result);
        System.out.println();
    }
	private static void sin() {
        acceptInput("degree", "Sine");
        result = Math.sin(Math.toRadians(input));
        printAnswer("Sine");
    }
	
	private static void cos() {
        acceptInput("degree", "Cosine");
        result = Math.cos(Math.toRadians(input));
        printAnswer("Cosine");
    }
	
	private static void tan() {
        acceptInput("degree", "Tangent");
        result = Math.tan(Math.toRadians(input));
        printAnswer("Tangent");
    }
	
	private static void sineInverse() {
        acceptInput("sine value", "sine inverse");
        result = Math.toDegrees(Math.asin(input));
        printAnswer("sin inverse");
    }
	
	private static void cosInverse() {
        acceptInput("cosine value", "cos inverse");
        result = Math.toDegrees(Math.acos(input));
        printAnswer("cos inverse");
    }
	
	private static void tanInverse() {
        acceptInput("Tangent value", "Tan inverse");
        result = Math.toDegrees(Math.atan(input));
        printAnswer("tan inverse");
    }
	
	private static void ln() {
        acceptInput("Value", "ln");
        result = Math.log(input);
        printAnswer("Natural log(ln)");
    }
	
	private static void log10() {
        acceptInput("Value", "log10");
        result = Math.log10(input);
        printAnswer("Log in base 10");
    }
	
	// trig menu
	private static void trig() {
        int choice;
        do {
            System.out.println("======[Trig]======");
            System.out.println("   [1] for sine");
            System.out.println("   [2] for cosine");
            System.out.println("   [3] for tangent");
            System.out.println("   [4] for sine inverse");
            System.out.println("   [5] for cosine inverse");
            System.out.println("   [6] for tangent inverse");
            System.out.println("   [7] go back to main-menu");
            System.out.println("   [8] Quit!");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sin();
                    break;
                case 2:
                    cos();
                    break;
                case 3:
                    tan();
                    break;
                case 4:
                    sineInverse();
                    break;
                case 5:
                    cosInverse();
                    break;
                case 6:
                    tanInverse();
                    break;
                case 7:
                    break;
                case 8:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid input...!\n");
           }
        } while (choice != 7 && repeat);
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

