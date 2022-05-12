/*Kurs: 1IK143
        Laboration: Labb3:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 20/10
        */
package djur;

import djur.Djur;

public class Reptil extends Djur {
    String levnadsmiljo;
    boolean giftig;

    public Reptil() {

    }

    @Override
    public int compareTo(Djur o) {
        return super.compareTo(o);
    }

    public Reptil(String namn, String latinsktNamn, double vikt, String late, String levnadsmiljo, boolean giftig) {
        super(namn, latinsktNamn, vikt, late);
        this.levnadsmiljo = levnadsmiljo;
        this.giftig = giftig;
    }

    public String getLevnadsmiljo() {
        return levnadsmiljo;
    }

    public void setLevnadsmiljo(String levnadsmiljo) {
        this.levnadsmiljo = levnadsmiljo;
    }

    public boolean isGiftig() {
        return giftig;
    }

    public void setGiftig(boolean giftig) {
        this.giftig = giftig;
    }

    @Override
    public String toString() {
        return  latinsktNamn+" lever i "+ getLevnadsmiljo();
    }

    @Override
    public String export() {
        return "R,"+this.getNamn()+","+this.getLatinsktNamn()+","+this.getVikt()+","+this.getLevnadsmiljo()+","+this.isGiftig()+","+getLate();
    }

    @Override
    public String utskrift() {
        String s="";
        if (this.giftig)
            s="giftig.";
        else
            s="inte giftig.";

        return this.namn + "("+ this.latinsktNamn+") väger omkring "+this.getVikt()+" kilo och bor i "+ this.levnadsmiljo+" samt är "+s+" Den låter: "+this.late;
    }
}

