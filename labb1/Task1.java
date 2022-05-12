/*      Kurs: 1IK143
        Laboration: Labb1:1
        Kursdeltagare: Jonathan Berg
        Termin och datum: 21 HT 11/9
 */


import java.util.Scanner;

public class Task1 {



    public static void main(String args[]) {

        System.out.println("Dyra böcker av Azimov AB");

        Scanner scan = new Scanner(System.in);
        System.out.println("Hur mycket kostar boken:\n");
        int price = scan.nextInt();


        System.out.println("Hur mycket betalar du med:\n");
        int valuta = scan.nextInt();
        int vaxel= (valuta-price);

        if (vaxel<0)
            System.out.println("Du har inte råd med boken");

        else
            System.out.print("Din växel blir " +vaxel + "kr\n");

        //utskriften delar först med sedelvalören för se antalet sedlar som går att uttnytja i varje valör
        System.out.println("Antal 500 kr-sedlar i växel: "+ vaxel/500);

        //den totala växeln uppdateras sedan via modulusoperanden för att uppdatera resten, detta steg utförs efter varje valör
        vaxel=vaxel%500;

        System.out.println("Antal 100 kr-sedlar i växel: "+ vaxel/100);
        vaxel=vaxel%100;

        System.out.println("Antal 50 kr-sedlar i växel: "+ vaxel/50);
        vaxel=vaxel%50;


        System.out.println("Antal 20 kr-sedlar i växel: "+ vaxel/20);
        vaxel=vaxel%20;

        System.out.println("Antal 10 kr i växel: "+ vaxel/10);
        vaxel=vaxel%10;

        System.out.println("Antal 5 kr i växel: "+ vaxel/5);
        vaxel=vaxel%5;


        System.out.println("Antal 2 kr i växel: "+ vaxel/2);
        vaxel=vaxel%2;

        System.out.println("Antal 1 kr i växel: "+ vaxel);
        vaxel=0;



    }
}
