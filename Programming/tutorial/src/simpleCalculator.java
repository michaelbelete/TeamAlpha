import java.io.*;

public class simpleCalculator {
    public static void main(String[] args){
        String s1 = getInput("Enter a value: ");
        System.out.println(s1);
    }

    private static String getInput(String prompt){
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.print("Prompt");
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }
}
