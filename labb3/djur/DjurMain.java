package djur;
/*Kurs: 1IK143
        Laboration: Labb3:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 10/10
        */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DjurMain {
    public static void main(String[] args) {
        Fagel kraka = new Fagel("Kråka","Corvus cornix",510.00,"kaw kaw kaw",true,true,"träd");
        //Fagel pafagel = new Fagel("Påfågel","Pavo cristatus",20.00,"ree ree",false,false,"marken")
        System.out.println(kraka.getNamn()+" säger: "+ kraka.getLate());
        Daggdjur hast = new Daggdjur("Häst","Equus ferus",200.00,"gnägg gnägg","Brun",false);
        System.out.println(hast.getNamn()+ " säger: "+ hast.getLate());
        Reptil leguan = new Reptil("Leguan","Iguanidae",100.00,"blubb blubb","tropisk regnskog",false);
        System.out.println(leguan.getNamn()+ " säger: "+leguan.getLate());







    }
}
