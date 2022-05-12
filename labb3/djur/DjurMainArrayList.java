/*Kurs: 1IK143
        Laboration: Labb3:6+7
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 22/10
        */
package djur;

import java.util.ArrayList;
import java.util.Collections;

public class DjurMainArrayList {
    public static void main(String[] args) {
        Fagel kraka = new Fagel("Kråka","Corvus cornix",510.00,"kaw kaw kaw",true,true,"träd");
        Fagel pafagel = new Fagel("Påfågel","Pavo cristatus",20.00,"ree ree",false,false,"marken");
        Daggdjur hast = new Daggdjur("Häst","Equus ferus",200.00,"gnägg gnägg","Brun",false);
        Daggdjur far = new Daggdjur("Tamfår","Ovis aries",50.00,"bääää","vit/grå",true);
        Reptil leguan = new Reptil("Leguan","Iguanidae",100.00,"blubb blubb","tropisk regnskog",false);
        Reptil havspadda= new Reptil("Havssköldpadda","Cheloniidae",200.00,"blblblblblbl","havet",false);




        //många djur
        ArrayList<Djur> djurList = new ArrayList<Djur>();
        djurList.add(hast);
        djurList.add(leguan);
        djurList.add(kraka);
        djurList.add(pafagel);
        djurList.add(far);
        djurList.add(havspadda);

        System.out.println("3.6 uppgift (notera osorterade arraylisten)");
        for (int i=0;i<djurList.size();i++)
            System.out.println("En "+djurList.get(i).getLatinsktNamn()+ " väger "+ djurList.get(i).getVikt()+ " och säger "+ djurList.get(i).getLate());

       /* Djur temp = new Djur();
        for(int b =0;b<djurList.size()-1;b++){
            if((djurList.get(b).compareTo(djurList.get(b+1))<=0)){
                temp=djurList.get(b);
                djurList.remove(b);
                djurList.add(temp);
            }
            else if ((djurList.get(b).compareTo(djurList.get(b+1))>0)){
                temp=djurList.get(b+1);
                djurList.remove(b+1);
                djurList.add(temp);
            }

        }*/

        System.out.println("\n\n\n");

        //sortering som uttnytjar min compareTO
        Collections.sort(djurList);

        /*for(Djur st:djurList) {
            System.out.println(st.latinsktNamn);
        }*/
        System.out.println("3.7 (notera efter sortering)");
        for (int i=0;i<djurList.size();i++)
            //System.out.println("En "+djurList.get(i).getLatinsktNamn()+ " väger "+ djurList.get(i).getVikt()+ " och säger "+ djurList.get(i).getLate());
            System.out.println(djurList.get(i).toString());
    }
}
