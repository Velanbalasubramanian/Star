public class Cr {
        public static void main(String[] args) {
            String[][]cars = {{"Volvo", "BMW", "Ford", "Mazda"},{"Hyundai", "Nissan", "new", "old"}}
                    ;
            for(int i=0;i<cars.length;i++){
                for(int j=0;j<cars[i].length;j++){
                    System.out.println(cars[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }