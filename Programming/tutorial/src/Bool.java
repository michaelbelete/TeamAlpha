public class Bool {
    public static void main(String[] args) {
        boolean b1 = true;
//        boolean b2 = false;

        System.out.println("The value of b1 is " + b1);
        boolean b2 = !b1;
        System.out.println("The value of !b1 is " + b2);

        int i = 2;
        boolean b3 = (i == 3); //return false
        System.out.println("The value of b3 is " + b3);

        //change string into boolean;

        String t = "true";
        String f = "false";
        String T = "True";
        String F = "False";

        //conver the strings into boolean
        boolean b4 = Boolean.parseBoolean(t);
        boolean b5 = Boolean.parseBoolean(f);
        boolean b6 = Boolean.parseBoolean(T);
        boolean b7 = Boolean.parseBoolean(f);
    }
}