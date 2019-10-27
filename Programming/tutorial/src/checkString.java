public class checkString {
    public static void main(String[] args){
        String welcomer = "Hello, World";
        int num = 23;
        if( welcomer instanceof java.lang.String){
            System.out.println(welcomer + " is a string");
        }else{
            System.out.println(welcomer + " is not a string");
        }
    }
}
