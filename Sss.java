import java.util.Arrays;
import java.util.Scanner;
public class Sss {

    public static void main(String[] args) {
        // create Scanner class object to take input
        Scanner scan = new Scanner(System.in);

        // read size of the array
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();

        // create an int array of size N
        int numbers[] = new int[n];

        // take input for the array
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            numbers[i] = scan.nextInt();
        }

        // calculate the cumulative sum of array
        int sum[] = cumulativeSum(numbers);

        // display result
        System.out.println("Cumulative sum = "
                + Arrays.toString(sum));

        // close Scanner
        scan.close();
    }

    // method to find cumulative sum of array
    public static int[] cumulativeSum(int[] numbers) {
        // variable
        int sum = 0;

        // traverse through the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // find sum
            numbers[i] = sum; // replace
        }

        // return
        return numbers;
    }
}
