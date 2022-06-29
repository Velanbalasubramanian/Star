import java.util.Scanner;

public class Use {
    public static void main (String [] args){
        int temp;
        boolean prime = true;
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter The Number");
        int num = scan.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            temp = num%i;
            if(temp==0)
            {
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}
