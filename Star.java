import java.util.Scanner;

public class Star {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("How many rows you want in this pattern");
int rows = sc.nextInt();
        int alphabet = 65;
for(int i=0;i<rows;i++){
    for (int j=0;j<=i;j++){
        System.out.print((char) alphabet + " ");
    }
    alphabet++;
    System.out.println();
    }


    }

}




/*
  Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
int b = '*';
for (int i=0;i<rows;i++){
    for (int j=0;j<=i;j++){
        System.out.print((char) b  + " ");
    }

    System.out.println();
}
 */