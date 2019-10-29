import java.lang.Math;
public class Excerice{
    public static void main(String[] args){
        printSecond(4);
        boolean nums = isMultiple(4,2);
        System.out.println(  nums);
        minimum3(4,3,1);
    }
    //1
    public static void printSecond(int second){
        for(int i = second; i > 0; i--){
            System.out.println(i + " Seconds remaining");
        }
        System.out.println("Stopped");
    }
    //2
    public static boolean isMultiple(int x, int y){
        if(x % y == 0){
            return true;
        }else{
            return false;
        }
    }
    //3 
    public static void minimum3(float x, float y, float z){
        float min = x;
        if(min > y & y < z){
            min = y;
        }else if(min > z & z < y){
            min = z;
        }
        System.out.println("the min number is " +  min);
    }
    
}