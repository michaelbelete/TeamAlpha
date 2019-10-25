import java.util.Scanner;
public class Practive {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = b + (--a);// --a have a difference wit a--
        //now c is 10 but if it was a-- c will be 11
        System.out.println("c is " + c);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        Scanner S = new Scanner(System.in);
        String A = S.next();
        char C = S.next().charAt(0);
        //we can't say nextchar because there is no next character so we use this command
        System.out.println(A);
        System.out.println(C);

    }
}
