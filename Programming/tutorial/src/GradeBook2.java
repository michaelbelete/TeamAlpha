import java.util.Scanner;
//1
public class GradeBook2{
  //2
    public static void main(String[] args){
        double[] grades;
        double average;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter number of grades you want to add: ");
        // int numGrades = input.nextInt();
        
        // if(numGrades >= 0){
        //     System.out.println("Please, enter a valid g")
        // }
        // for(int i = 0; i < numGrades; i++){
        //     System.out.println(grades[i]);
        //     grades[i] = input.nextDouble();
        // }
        grades = new double[args.length];
        for(int i = 0; i < args.length; i++){
            grades[i] += Double.parseDouble(args[i]);
        } 

        printGrades(grades);
        average = averageGrade(grades);
        System.out.println("The Average is " + average + "%");
        printGrade(average);
        // }
    }

    public static void printGrades(double[] grades){
        for(int i = 0; i < grades.length; i++){
            System.out.println(i+1 + ") " + grades[i]);
        }
    }

    public static double averageGrade(double[] grades){
        double sum = 0;
        //4
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        } 
        double average = sum / grades.length;

        return average;
    }

    public static void printGrade(double average){
        String message = new String();
        if(average > 90){
            message += "A";
        }else if(average >= 80){
            message += "B";
        }else if(average >= 70){
            message += "C";
        }else if(average >= 60){
            message += "D";
        }else{
            message += "F";
        }
            System.out.println("Your grade is " + message);
        }
}