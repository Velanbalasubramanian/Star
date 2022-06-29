public class Sample {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'M', 'E', 'L', 'T','O', 'N','F'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 1, copyTo, 0, 8);
 System.out.println(copyTo);
    }
}