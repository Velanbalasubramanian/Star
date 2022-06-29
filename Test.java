import java.util.Scanner;
/* ODD or EVEN NUMBER    */
public class Test {
    public static void main(String [] args){
Scanner S = new Scanner(System.in);
System.out.println("Enter the number");
int a = S.nextInt();
if(a%2==0){
    System.out.println("Even number");
}
else{
    System.out.println("Odd number");
}
    }

}
