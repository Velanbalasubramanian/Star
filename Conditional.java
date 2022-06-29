import java.awt.*;
import java.util.concurrent.SynchronousQueue;
public class Conditional {
    public static void main (String [] args) {
        for(int i=0;i<10;i++){
            if(i%2==0)
/* return; break; ???? */
            System.out.println(i + " ");
        }



       /* int age = 18 ;
        if(17>18){
            System.out.println("Finerprint access granted");
        }
        else if (15>13) {
            System.out.println("Finerprint access denied");
        }
        else{
            System.out.println("default");
        } */
       /* Java Short Hand If Else Ternary Operator /*  int num = 24;
       String result;
       result = (num>22)? "Correct" : "Wrong" ;
       System.out.println(result); */
/*Switch statement
  int day = 6 ;
  switch (day){
      case 1:
          System.out.println("Sunday");
          break;
      case 2:
          System.out.println("Monday");
          break;
      case 3:
          System.out.println("Tuesday");
          break;
      case 4:
          System.out.println("Wednesday");
          break;
      default:
          System.out.println("Next Week");
  } */

    }
}
