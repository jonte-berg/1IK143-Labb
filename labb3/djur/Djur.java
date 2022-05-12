package djur;
/*Kurs: 1IK143
        Laboration: Labb3:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 20/10
        */
public abstract class Djur implements Comparable<Djur> {
    String namn;
    String latinsktNamn;
    double vikt;
    String late;

    public Djur(){

    }

    public Djur(String namn, String latinsktNamn, double vikt, String late) {
        this.namn = namn;
        this.latinsktNamn = latinsktNamn;
        this.vikt = vikt;
        this.late = late;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getLatinsktNamn() {
        return latinsktNamn;
    }

    public void setLatinsktNamn(String latinsktNamn) {
        this.latinsktNamn = latinsktNamn;
    }

    public double getVikt() {
        return this.vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    public  String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    @Override
    public int compareTo(Djur o) {


       if((int)this.getLatinsktNamn().charAt(0) > (int)o.getLatinsktNamn().charAt(0))
            return 1;
        else if((int)this.getLatinsktNamn().charAt(0) == (int)o.getLatinsktNamn().charAt(0))
            return 0;
        else
            return -1;


    }

    @Override
    public String toString() {
        return "Djur{" +
                "namn='" + namn + '\'' +
                ", latinsktNamn='" + latinsktNamn + '\'' +
                ", vikt=" + vikt +
                ", late='" + late + '\'' +
                '}';
    }
    public abstract String export();
//för sista upgft utskrift enligt figur
    public abstract String utskrift();
}
