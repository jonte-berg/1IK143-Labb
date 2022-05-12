import java.util.Arrays;
/*Kurs: 1IK143
        Laboration: Labb3:3
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 12/10
        */
public class PlanetMedManobjekt  {

    String namn;
    int plats;
    Mane[] manar= new Mane[200];
    int aphelium;
    int pehihelium;
    int antalManar=0;


    public PlanetMedManobjekt(String namn,int plats ,int aphelium ,int pehihelium ){
        this.namn = namn;
        this.plats = plats;
        this.aphelium = aphelium;
        this.pehihelium = pehihelium;

    }

    public PlanetMedManobjekt() {
    }

    public int getPlats() {
        return plats;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public void setManar(Mane[] manar) {
        this.manar = manar;
    }

    public int getAphelium() {
        return aphelium;
    }

    public void setAphelium(int aphelium) {
        this.aphelium = aphelium;
    }

    public int getPehihelium() {
        return pehihelium;
    }

    public void setPehihelium(int pehihelium) {
        this.pehihelium = pehihelium;
    }

    public void setAntalManar(int antalManar) {
        this.antalManar = antalManar;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void addMane(Mane m){
        manar[antalManar]=m;
        this.antalManar++;

    }

    public int getAntalManar() {
        return antalManar;
    }
    public String getManar(){
        String s="";
        if(this.manar[0]==null)
            return s;
        else
        for (int i=0;i< this.antalManar;i++)
           s+= manar[i].toString();
    return s;
    }

    @Override
    public String toString() {
        return "Planeten heter "+ this.namn+ "\nPlaneten har position: " + this.plats + " från solen\n"+ "Aphelium: "+this.aphelium+ "\nPerihelium: "+ this.pehihelium +"\nPlaneten har "+this.antalManar+" månar\nPlaneten har följande månar:\n"+ getManar();
    }
}