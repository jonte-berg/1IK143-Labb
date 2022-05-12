

/*Kurs: 1IK143
        Laboration: Labb3:2
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 10/10
        */
public class PlanetM extends Planet {


    private int antalManar=0;

    //kör max fem månar this case
    String[] Manar= new String[5];

    public PlanetM(String namn,int plats ,int manar,int aphelium ,int pehihelium ){
        this.namn = namn;
        this.plats = plats;
        this.manar = manar;
        this.aphelium = aphelium;
        this.pehihelium = pehihelium;

    }

    public PlanetM() {
    }

    public void addMane(String m){
       Manar[antalManar]=m;
       this.antalManar++;
   }
   public String[] showManar(){
       return Manar;
   }
    public int getAntalManar() {
        return antalManar;
    }
 }
