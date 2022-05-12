/*Kurs: 1IK143
        Laboration: Labb3:2
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 12/10
        */
public class PlanetMMain {
    public static void main(String[] args) {
        PlanetM Jupiter = new PlanetM("Jupiter",5,79,816520800,740573600);
        Jupiter.addMane("Metis");
        Jupiter.addMane("Adraesta");
        Jupiter.addMane("Amalthea");
        Jupiter.addMane("Thebe");
        System.out.println(Jupiter.toString());
        for (int i=0;i<Jupiter.getAntalManar();i++)
            System.out.println("Måne "+(i+1)+" heter "+Jupiter.showManar()[i]);



        //PlanetMedManobjekt main
        Mane Metis = new Mane("Metis",43);
        PlanetMedManobjekt Jupiter1 = new PlanetMedManobjekt("Jupiter",5,816520800,740573600);
        Jupiter1.addMane(Metis);
        System.out.println(Jupiter1.toString());

        PlanetMedManobjekt Mars = new PlanetMedManobjekt();
        Mane Phobos = new Mane("Phobos",22);
        Mane Deimos = new Mane("Deimos",12);
        Mars.setNamn("Mars");
        Mars.addMane(Phobos);
        Mars.addMane(Deimos);
        System.out.println(Mars.toString());
    }
}
