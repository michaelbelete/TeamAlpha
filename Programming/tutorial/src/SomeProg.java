import java.util.Scanner;
public class SomeProg
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = S.nextInt();
        System.out.print("Enter number of students of a group: ");
        int g = S.nextInt();
        System.out.println("Groups formed: " + num/g);
        System.out.println("Students left: " + num%g);
    }
}