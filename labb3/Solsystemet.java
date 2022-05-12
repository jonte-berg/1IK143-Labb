import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Arrays;
import java.util.Scanner;
/*Kurs: 1IK143
        Laboration: Labb3:4
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 15/10
        */
public class Solsystemet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input=0;
        String namn="";
        int plats=0;
        int manAntal;
        String opt="";
        PlanetMedManobjekt[] planetList = new PlanetMedManobjekt[100];
        int antalPlaneter=0;
        int aphelium=0;
        int pehihelium=0;
        int dia=0;

        String mNamn="";
        //meny
        while(input!=3){
            System.out.println("\n\nSolystemet\n========\n1. Visa inlagda planeter\n2. Lägga till planet\n3. Avsluta");
            input = scan.nextInt();
        switch(input){

            case (1):
                System.out.println("du gav "+input);
                if (planetList[0]==null)
                    System.out.println("inga planeter bror");
                else{
                   for(int i=0;i<=antalPlaneter-1;i++)
                       System.out.println(planetList[i].toString());
                }
                break;

            case(2):

                System.out.println("du gav "+input);
                PlanetMedManobjekt temp = new PlanetMedManobjekt();
                Mane tempM=new Mane();
                scan.nextLine(); //nextInt() "bug", behöver konsumera \n med hjälp av en nextLine call för att inte skriva ut souts direkt
                System.out.println("Vad heter planeten? ");
                namn=scan.nextLine();
                System.out.println("Vilken plats från solen? ");
                plats=scan.nextInt();

                System.out.println("Hur många månar? ");
                manAntal=scan.nextInt();
                scan.nextLine();

                System.out.println("Vill du skriva in månar? (J/N)");

                opt=scan.nextLine();
                if (opt.contentEquals("j")||opt.contentEquals("J")) {
                   tempM = new Mane();
                    System.out.println("Skriv in Månar, avsluta med stopp");

                    while(true){
                        System.out.println("Namn: ");
                        mNamn = scan.nextLine();
                        if(mNamn.contentEquals("stopp")) {
                            break;
                        }
                        else {
                            System.out.println("Ange diameter i hela km: ");
                            dia = scan.nextInt();
                            scan.nextLine();
                            temp.addMane(createMane(mNamn,dia));
                        }



                    }


                }

                    System.out.println("Ange aphelium");
                    aphelium = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ange pehihelium");
                    pehihelium = scan.nextInt();
                    scan.nextLine();
                    temp.setNamn(namn);
                    temp.setAntalManar(manAntal);
                    temp.setPlats(plats);
                    temp.setAphelium(aphelium);
                    temp.setPehihelium(pehihelium);


                planetList[antalPlaneter] = temp;
                antalPlaneter++;



                break;

            case(3):
                System.out.println("Programmet avslutas, hejdå! ");
                System.exit(0);
                break;

        }

    }
    }
    public static Mane createMane(String s, int i){
        Mane temp = new Mane(s,i);
        return temp;

    }
}
