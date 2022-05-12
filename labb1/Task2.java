/*      Kurs: 1IK143
        Laboration: Labb1:2
        Kursdeltagare: Jonathan Berg
        Termin och datum: 21 HT 11/9
 */


import java.util.Random;
import java.util.Scanner;

public class Task2 {



    public static void main(String[] args) {

        int playerRoll=0;
        int doktorRoll=0;

        System.out.println("\n---------------------");
        System.out.println("Spela med doktorn");
        System.out.println("Redo att spela? (J/N)");
        Scanner scan = new Scanner(System.in);

        String input;
        input = scan.nextLine();


        if (input.charAt(0) == 'j' || input.charAt(0) == 'J') {

                //temp som används vid ev. andra slaget

                int temp = 0;
                Random num = new Random();
               //första slaget
                playerRoll = (num.nextInt(5) + 1);
                System.out.println("Du slog: " + playerRoll);
                System.out.println("Vill du slå igen?   (J/N)");
                input = scan.nextLine();


                //check för andra slaget
                if (input.charAt(0) == 'j' || input.charAt(0) == 'J') {

                    temp = num.nextInt(5) + 1;
                    playerRoll = (playerRoll + temp);
                    System.out.println("Du slog : " + temp + " och har nu totalt: " + playerRoll);
                }


                //doktorns slag, som alltid sker
                doktorRoll = (num.nextInt(5) + 1);
                System.out.println("Doktorn slog: " + doktorRoll);

               //checken för ifall doktorn ska lägga ett slag till
                if (doktorRoll <= 3) {
                    temp = num.nextInt(5) + 1;
                    System.out.println("Doktorn slår igen... och får: " + temp + ",totalt har doktorn: " + (doktorRoll + temp));
                    doktorRoll=doktorRoll+temp;
                }




                //spelregel-checks för se vem som vann
                if (playerRoll > 9)
                    System.out.println("Du blev tjock så doktorn vann!");

                else if (playerRoll == doktorRoll)
                    System.out.println("Det blev lika!");
                else if (playerRoll > doktorRoll)
                    System.out.println("Du vann!");
                else
                    System.out.println("Du förlorade");


            }






    }
}
