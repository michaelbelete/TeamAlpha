//1
public class GradeBook{
  //2
    public static void main(String[] args){
        //3 
        double[] grades = {88,90,34,50};
        for(int i = 0; i < grades.length; i++){
            System.out.println(i+1 + ") " + grades[i]);
        }

        double sum = 0;
        //4
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        System.out.println("The sum is " + sum);

        //5 
        double average = sum / grades.length;
        System.out.println("The Average is " + average + "%");

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