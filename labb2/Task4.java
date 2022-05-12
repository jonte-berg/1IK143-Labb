/*      Kurs: 1IK143
        Laboration: Labb2:4
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 26/9

 */

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {

        int[] speedArray = new int[5];
        String inputMessage="Ange hastighet i KM: ";
        Scanner in = new Scanner(System.in);

        System.out.println("Bilhastigheter i Km.\n");

        for(int i=0;i<speedArray.length;i++){
            System.out.print(inputMessage);
            speedArray[i] = in.nextInt();

        }
        //java 8 stream lösning <3
        int min= Arrays.stream(speedArray).min().getAsInt();
        int max= Arrays.stream(speedArray).max().getAsInt();
        double avg= Arrays.stream(speedArray).average().getAsDouble();
        System.out.println("Min i array= "+ min);
        System.out.println("Max i array= "+ max);
        System.out.println("Avg i array= "+ avg);






    }
}
