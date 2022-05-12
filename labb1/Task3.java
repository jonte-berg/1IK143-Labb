/*      Kurs: 1IK143
        Laboration: Labb1:3
        Kursdeltagare: Jonathan Berg
        Termin och datum: 21 HT 12/9
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
// för alternativ lösning ta bort kommentar
// import java.text.DecimalFormat;
import java.util.Scanner;
public class Task3 {


    public static void main(String[] args) {

        double volym;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mata in Radie i km: ");
        double radie = scan.nextDouble();

        //volym = en jobbig formel som jag hittade för volym
        volym= BigDecimal.valueOf((4 * Math.PI * Math.pow(radie, 3)) / 3).setScale(3,RoundingMode.HALF_UP).doubleValue();


        //lösning med hjälp av printformat, %10.2 (%10=bredden på formatering, .2 = antal decimaler, e= scientific notation (från s168))
        System.out.printf("Volymen blir: %10.2e kubikkilometer.",volym);


        //alternativ lösning med decimalformat

         /* DecimalFormat f = new DecimalFormat("0.###E0");
         String formatOutput= f.format(volym);

          System.out.println("Volymen blir: " +formatOutput +  " kubikkilometer");

         */






    }
}
