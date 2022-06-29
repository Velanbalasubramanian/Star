import java.util.Scanner;

public class Even {
    public static void main(String [] args){
        int num = 100;
        System.out.print("Enter the even number :");
        for (int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print(i + " ");

            }
        }
    }
}
