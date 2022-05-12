/*Kurs: 1IK143
        Laboration: Labb3:1
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 10/10
        */
public class Planet {

String namn;
int plats;
int manar;
int aphelium;
int pehihelium;



    public Planet() {

    }

    public Planet(String namn,int plats ,int manar,int aphelium ,int pehihelium ){
        this.namn = namn;
        this.plats = plats;
        this.manar = manar;
        this.aphelium = aphelium;
        this.pehihelium = pehihelium;

    }

    @Override
    public String toString() {
        return "Planet{" +
                "namn='" + namn + '\'' +
                ", plats=" + plats +
                ", manar=" + manar +
                ", aphelium=" + aphelium +
                ", pehihelium=" + pehihelium +
                '}';
    }

    public int getPlats() {
        return plats;
    }

    public int getManar() {
        return manar;
    }

    public int getAphelium() {
        return aphelium;
    }

    public int getPehihelium() {
        return pehihelium;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public void setManar(int manar) {
        this.manar = manar;
    }

    public void setPehihelium(int pehihelium) {
        this.pehihelium = pehihelium;
    }

    public void setAphelium(int aphelium) {
        this.aphelium = aphelium;
    }

}