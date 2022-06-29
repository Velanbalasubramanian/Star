import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
/* int week = 8;
String weekString="";
switch (week){
    case 1: weekString="Sunday";
    break;
    case 2: weekString="Monday";
        break;
    case 3: weekString="Tuesday";
        break;
    case 4: weekString="Wednesday";
        break;
    case 5: weekString="Thursday";
        break;
    case 6: weekString="Friday";
        break;
    case 7: weekString="Saturday";
        break;
    default: weekString="Invalid Week";

}
  */
        /* char ch = 'O';
        switch(ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel123");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        } */
String levelString ="Expert";
int level = 0;
switch (levelString){
    case "Beginner":level=1;
    break;
    case "Intermediate":level=2;
        break;
    case "Expert":level=3;
        break;
    default:level=0;
    break;
}
System.out.println("Your Level is " + level);
    }


}




