import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room peoples count: ");
        String[] string = new String [sc.nextInt()];
        sc.nextLine();
        System.out.println("Enter room peoples: ");
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        System.out.println("Current bill this month: ");
        int c= sc.nextInt();
        System.out.println("Enter room rent : ");
        int d= sc.nextInt();
        System.out.println("Internet bill: ");
        int e= sc.nextInt();
        int Total = c+d+e;
        int BillDetails = Total/string.length;

       // System.out.println("Total:" + Total);
       // int BillDetails;
        System.out.println("BillDetails:");
        for (int i = 0; i <string.length ; i++)
        {
            System.out.println(string[i] + " - " + BillDetails);
        }
        System.out.println("Total - " + Total);
        System.out.println("Room rent individual per month  - " + d/string.length);
        System.out.println("Current bill individual per month  - " + c/string.length);
        System.out.println("Internet bill individual per month  - " + e/string.length);

    }}
//public static void main (String []args){
//
//    System.out.println("Enter room peoples count:");
//    Scanner sc= new Scanner(System.in);
//    int count = sc.nextInt();
//    System.out.println("enter the people name");
//    Scanner s= new Scanner(System.in);
//    String[] people = new String [s.nextInt()];
//    s.nextLine();
//    for (int i = 0; i < people.length; i++)
//    {
//        people[i] = s.nextLine();
//    }
//    System.out.println("enter the rent");
//    Scanner r= new Scanner(System.in);
//    int rent = r.nextInt();
//    int result = rent/3;
//    System.out.println(result);
//
//}
//}
