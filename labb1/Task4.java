/*      Kurs: 1IK143
        Laboration: Labb1:4
        Kursdeltagare: Jonathan Berg
        Termin och datum: 21 HT 13/9
 */
import java.util.Random;
import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);
        Random r= new Random();

        //"lagliga" bokstäver i registreringsskylten
        String letters="ABCDEFGHJKLMNOPRSTUVXYZ";


        System.out.println("Hur många registreringsnummer önskas? ");
        input=scan.nextInt();
        System.out.println(input+ " registreringsnummer genereras.....");

        //strängen som håller i registrerings #
        StringBuilder s = new StringBuilder();

        //loop som itereras tills input (korrekt antal registreringsnummer från indata) blir noll
        while(input>0){

            //första två bokstäverna fick EJ innehålla Z, till skillnad från resten av bokstäverna som genereras så blir då dessa två första letters.length()-1 då sista bokstaven i strängen är Z


            s.append(letters.charAt(r.nextInt(letters.length()-1)));
            s.append(letters.charAt(r.nextInt(letters.length()-1)));


            //0-9
            s.append(r.nextInt(10));
            s.append(r.nextInt(10));

            s.append(" ");

            //sista tre bokstäver som FÅR ha ett Z (notera avsaknaden av -1 på letters.length())
            s.append(letters.charAt(r.nextInt(letters.length())));
            s.append(letters.charAt(r.nextInt(letters.length())));
            s.append(letters.charAt(r.nextInt(letters.length())));

            System.out.println("Reg #"+input+": "+s);

            //töm strängen för att påbörja nästa (skulle alternativt kunna spara alla reg# i en array istället för "uppdatera" och använda samma sträng)
            s.delete(0,s.length());

            //ett nummer färdigt -- som vanligt
            input--;
        }

    }
}
