/*Kurs: 1IK143
        Laboration: Labb3:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 20/10
        */
package djur;

public class Daggdjur extends Djur {
    String palsfarg;
    boolean harVintepals;

    public Daggdjur() {

    }

    public Daggdjur(String namn, String latinsktNamn, double vikt, String late, String palsfarg,boolean harVintepals) {
        super(namn, latinsktNamn, vikt, late);
        this.palsfarg = palsfarg;
        this.harVintepals=harVintepals;
    }

    public String getPalsfarg() {
        return palsfarg;
    }

    public void setPalsfarg(String palsfarg) {
        this.palsfarg = palsfarg;
    }

    public boolean isHarVintepals() {
        return harVintepals;
    }

    public void setHarVintepals(boolean harVintepals) {
        this.harVintepals = harVintepals;
    }

    @Override
    public String toString() {
        return  latinsktNamn+" har pälsfärgen "+ getPalsfarg();
    }
    @Override
    public String export() {
        return "D,"+this.getNamn()+","+this.getLatinsktNamn()+","+this.getVikt()+","+this.getPalsfarg()+","+this.isHarVintepals()+","+getLate();
    }

    @Override
    public String utskrift() {
        String s="";
        if (this.harVintepals)
            s=" och vinterpäls.";
        else
            s=" men ingen vinterpäls.";

        return this.namn + "("+ this.latinsktNamn+") väger omkring "+this.getVikt()+" kilo och har pälsfärgen "+ this.palsfarg+s+" Den låter: "+this.late;
    }
}
