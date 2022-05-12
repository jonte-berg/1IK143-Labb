/*      Kurs: 1IK143
        Laboration: Labb2:1
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 20/9

 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        double summa=0;
        String input;
        double amount;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Till vilken  valuta vill du konvertera? (svenska/danska): ");
        input=scan.nextLine();
        System.out.println("Hur mycket vill du konvertera");
        amount=scan.nextDouble();

        //här kallar vi på metoden med parametrar
        konvert(input,amount);





    }
    public static void konvert(String s,Double d){
        double sum=0;

        double DK=1.37;
        double SEK=0.73;

        if((s.toLowerCase().contains("sv"))){
            sum= BigDecimal.valueOf(d*DK).setScale(2, RoundingMode.HALF_UP).doubleValue();
            System.out.println("du ville konvertera till svenska");
            System.out.println("Du kommer att få "+ sum+ " svenska kronor");

        }

        else {
            sum = BigDecimal.valueOf(d * SEK).setScale(2, RoundingMode.HALF_UP).doubleValue();
            System.out.println("du ville konvertera till danska");
            System.out.println("Du kommer att få "+ sum+ " danska kronor");

        }

    }
}
