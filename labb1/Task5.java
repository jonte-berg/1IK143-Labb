/*      Kurs: 1IK143
        Laboration: Labb1:5
        Kursdeltagare: Jonathan Berg
        Termin och datum: 21 HT 15/9
 */
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {


        int hojd;
        int bredd;
        int space;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hur stor prisma vill du ha? ");
        hojd=scan.nextInt();



        //yttersta loopen, notera att denna loop styr allt
        for (int i = 1; i <= hojd; ++i) {

            //radbrytning
            System.out.println();


            //varje iteration resetar  de nästlade loopvariablerna  ( annars skulle de aldrig bli true o köras efter den allra första iterationen)
             bredd=1;
             space=0;




            /*hur många mellanslag/utskrifter innan första stjärnan i kollumnen  skrivs ut
            (dvs det som förskjuter * till höger för att skapa pyramidform, om input=5 är det 5 utskrifter "  " innan *)
            */

            while(space<=(hojd-i)) {
                ++space;
                System.out.print("  ");

            }

            /* själva "bredden" i pyramiden som itereras sålänge bredd variablen är mindre eller lika med antal iterationer i yttersta loopen (i * 2 -1)
            ie rad 1 ska ha 2*1-1=1   *
               rad 2 ska ha 2*2-1=3  ***
               rad 3 ska ha 2*3-1=5 *****
               osv......
            */

            while (bredd<=2*i-1) {

                System.out.print("* ");
                bredd++;
            }


        }
    }
}

