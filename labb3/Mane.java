/*Kurs: 1IK143
        Laboration: Labb3:1
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 10/10
        */
public class Mane {

    String namn;
    int diameter;

    public Mane(){

    }

    public Mane(String n,int d ){
    this.namn=n;
    this.diameter=d;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return namn + " ("+diameter+"km)\n";
    }
}
