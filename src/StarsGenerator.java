import java.util.Scanner;

import static java.lang.System.exit;

public class StarsGenerator {
    public static void main(String[] args) {
        System.out.println("Star generator!");
        System.out.print("Enter digit (0 -30): ");
        Scanner in = new Scanner(System.in);
        int power = in.nextInt();
        if(power > 30){
            System.out.println("Maximum number exceeded!");
            exit(-2);
        }
        String resultStars = star(power);
        System.out.println(resultStars);
        double check = Math.pow(Double.valueOf("2"), Double.valueOf(power));

        if(resultStars.length() == (int)check){
            System.out.println(String.format("Correct output -> %d stars generated for (2 power of %d) is %d", resultStars.length(), power, (int)check));
        }
    }
    private static String star(int n){
        if ( n==0 ){
            return "*";
        } else {
            String starString = star( n - 1 );
            return starString + starString;
        }
    }
}
