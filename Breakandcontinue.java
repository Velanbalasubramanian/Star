public class Breakandcontinue {
    public static void main (String [] args) {
       /* for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                if(i==2 && j==2){
                    continue;

                }
                System.out.println(i+ " "+j);

            }
        }   */
        int i = 1;
        do{
            if(i==5){
i++;
                continue;
            }
            System.out.println(i);
i++;
        }
        while(i<=10);
    }
}
