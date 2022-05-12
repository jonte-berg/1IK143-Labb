/*Kurs: 1IK143
        Laboration: Labb3:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 20/10
        */
package djur;

import djur.Djur;

public class Fagel extends Djur {
    boolean arFlyttfagel;

    @Override
    public int compareTo(Djur o) {
        return super.compareTo(o);
    }

    boolean kanFlyga;
    String redetyp;

    public Fagel() {

    }

    public Fagel(String namn, String latinsktNamn, double vikt, String late, boolean arFlyttfagel, boolean kanFlyga, String redetyp) {
        super(namn, latinsktNamn, vikt, late);
        this.arFlyttfagel = arFlyttfagel;
        this.kanFlyga = kanFlyga;
        this.redetyp = redetyp;
    }

    public boolean isArFlyttfagel() {
        return arFlyttfagel;
    }

    public void setArFlyttfagel(boolean arFlyttfagel) {
        this.arFlyttfagel = arFlyttfagel;
    }

    public boolean isKanFlyga() {
        return kanFlyga;
    }

    public void setKanFlyga(boolean kanFlyga) {
        this.kanFlyga = kanFlyga;
    }

    public String getRedetyp() {
        return redetyp;
    }

    public void setRedetyp(String redetyp) {
        this.redetyp = redetyp;
    }

    @Override
    public String toString() {
        return  latinsktNamn+" lägger sina ägg i/på "+getRedetyp();
    }
    @Override
    public String export() {
        return "F,"+this.getNamn()+","+this.getLatinsktNamn()+","+this.getVikt()+","+this.isArFlyttfagel()+","+this.isKanFlyga()+","+this.getRedetyp()+","+this.getLate();
    }
    @Override
    public String utskrift() {
        String s="";
        if (this.arFlyttfagel)
            s="flyttfågel";
        else
            s="inte en flyttfågel ";
        if(this.kanFlyga)
            s+=" som kan flyga";
        else
            s+=" och kan inte flyga";

        return this.namn + "("+ this.latinsktNamn+") väger omkring "+this.getVikt()+" kilo och är  "+s+" samt har sitt bo i/på  "+this.redetyp+". Den låter: "+this.late;
    }
}
