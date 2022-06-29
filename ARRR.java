import java.util.Scanner;

public class ARRR {
    public static void main(String[] args) {
        int e[] = {1, 2, 3, 4, 5, 6, 5, 7, 8, 9};
        int p;
        int ispresent = 0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = S.nextInt();
        for (int i = 0; i < e.length; i++) {
            if (e[i] == a) {
                p = e[i];
                ispresent = 2;
            }
        }
        if (ispresent == 2) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }
}