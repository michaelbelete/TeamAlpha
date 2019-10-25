// simple console based calculator with java
// @author Eyob Alemu

import java.util.Scanner;

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

