import java.util.Arrays;
/*Kurs: 1IK143
        Laboration: Labb3:1
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 10/10
        */
public class PlanetMain {

    public static void main(String[] args) {


        Planet Jorden = new Planet("Jorden",3,1,152097701,147098074);

        Planet Mars = new Planet();
        Mars.setNamn("Mars");
        Mars.setPlats(4);
        Mars.setManar(2);
        Mars.setAphelium(249209300);
        Mars.setPehihelium(206669000);


        System.out.println(Jorden.toString()+"\n"+Mars.toString());



    }
}
