public class Mnim {





  /*  static int[]get(){
    return new int[]{1,2,3,5,40};
}
public static void main (String[]args){
    int arr [] = get();
    for(int i =0;i<arr.length;i++)
        System.out.println(arr[i]);
}
}  */


  /* static void max(int arr[]) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a > arr[i])
                a = arr[i];

        }
        System.out.println(a);
    }
    public static void main (String[]args){
        int num[] = {22, 55, 98, -1, 55};
        max(num);
    } */


/* (2. Anonymous Array)  static void printArray(int a[]){
    for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
}
public static void main(String[]args){
int a [] = {0,1,2,3,4,6};
printArray(a);

    //printArray(new int[]{0,1,2,3,4,5,});
  */

  static void max(int arr[]) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a < arr[i])
                a = arr[i];

        }
        System.out.println(a);
    }
    public static void main (String[]args){
        int num[] = {10,20,20,30,30,30,10};
        max(num);}}