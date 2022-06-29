import java.awt.*;
import java.util.concurrent.SynchronousQueue;

public class Main {
 static int plusmethod (int x ,int y){
     return x + y;
 }
    static double plusmethod (double  x ,double  y){
        return x + y;
    }
 public static void main (String [] args){
     int myNum = plusmethod (5,8);
     double myNum1 = plusmethod (4,8);
     System.out.println(" int " + myNum);
     System.out.println(" double " + myNum1);
 }
}