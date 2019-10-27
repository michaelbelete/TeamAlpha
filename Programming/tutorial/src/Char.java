public class Char {
    public static void main(String[] args){
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        char dollar = '\u0024'; //code found in unicode.org
        System.out.print(dollar);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print("\n");

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1) );
        System.out.print(Character.toUpperCase(a2) );
        System.out.print(Character.toUpperCase(a3) );
    }
}
