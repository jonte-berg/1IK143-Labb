/*      Kurs: 1IK143
        Laboration: Labb2:2
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 23/9

 */

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        int hojd;
        int bredd;

        Scanner scan = new Scanner(System.in);
        //denna DO-while körs alltid en gång, och den gör en check ifall bredd=0 och isf avslutas iterationerna
        do {
            System.out.println("\n\n\n---------------------------------------------------------");
            System.out.println("Hur HÖG ska lego vara: ");
            hojd = scan.nextInt();
            System.out.println("Hur BRED ska lego vara: ");
            bredd = scan.nextInt();

            if(bredd==0)
                break;

            legobuilder(bredd, hojd);
        } while (bredd != 0);
        System.out.println("Inga fler legon ska byggas");

    }

    public static void legobuilder(int b, int h) {

        //breddloopvariable
        int space = 0;

        //ramvariabel
        int y = 1;

        //yttre "ram"
        StringBuilder legoString = new StringBuilder();
        //mainsträng för lego
        StringBuilder legoString2 = new StringBuilder();

        //ramen
        legoString.append("- - -");
        while (y != b ){
            legoString.append(" -");
        y++;
        }



        //höjd iteration
        for (int i = 1; i <= h; ++i) {

            //nolla bredden
            space=0;

            while(space <= (b)) {
                //ifall bredd=0 == starten på en RAD
                if (space==0)
                    legoString2.append("|");
                //ifall bredd= B == slutet på en RAD
                if(space==b){
                    legoString2.append(" |\n");
                    //efter RAD är SLUT, hoppa ur iterationen o påbörja NY ITERATION/HÖJD/RAD
                    break;
                }
                //om varken början eller slutet på en rad == lägg till lego-ikonen
                legoString2.append(" O");
                space++;
            }
        }

        System.out.println(legoString);//övre ramen
        System.out.print(legoString2); //lego
        System.out.print(legoString); //undre ramen

    }

}

