import java.util.Arrays;

public class MultiDimensionalDemo {
    public static void main(String[] args){

        String[][] cities = new String[3][3];
        cities[0][0]="İstanbul";
        cities[0][1]="Bursa";
        cities[0][2]="Bilecik";
        cities[1][0]="Ankara";
        cities[1][1]="Konya";
        cities[1][2]="Kayseri";
        cities[2][0]="Diyarbakır";
        cities[2][1]="Şanlıurfa";
        cities[2][2]="Gaziantep";

        for (int i=0;i<=2;i+=1){
            System.out.println("*******************");
            for (int j=0;j<=2;j+=1){
                System.out.println(cities[i][j]);
            }
        }System.out.println("*******************");

        System.out.println("\n");


        //forEach
        for (String[]  city:cities) {
            System.out.println(Arrays.toString(city));
        }




    }
}
