/*      Kurs: 1IK143
        Laboration: Labb2:3
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 25/9

 */


import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        boolean valid;
        String password="";
        Scanner in = new Scanner(System.in);

        //tills du skriver in "avsluta"
        while(password!="avsluta") {

            System.out.println("Ange ett tänkt lösenord, eller \"avsluta\" för att avsluta: ");
            password = in.nextLine();


            if (password.contains("avsluta"))
                break;

            else {
                System.out.println("din sträng: " + password);
                valid = passCheck(password);
                System.out.println("password ok? :  " + valid);
            }

        }

    }

    public static boolean passCheck(String s){


        int intCount=0;
        int symbolCount=0;
        int versalCount=0;

        char[] chars = s.toCharArray();

        //iterera strängen och räknar siffror samt symboler samt versaler
        for(int i=0;i<chars.length;i++){
            char c= chars[i];
            if(Character.isDigit(c))
                intCount++;

            if(!Character.isLetterOrDigit(c))
                symbolCount++;
            if(Character.isUpperCase(c))
                versalCount++;
        }

        //felsöknings-utskrifter
       /* System.out.println("din sträng i metoden: "+ s);
        System.out.println("Din strängs längd: "+ s.length());
        System.out.println("detta är antalet symboler:" +symbolCount);
        System.out.println("strängen har " + intCount + " siffror ");
        System.out.println("strängen har " + versalCount + " Versaler ");*/


        //ifall längden är mindre än 8
        if(s.length()<=7)
            return false;

        //ifall det inte finns 4 siffror=false
        else if(intCount<4)
            return false;
        //ifall det finns mindre än 2 non-alphanumericals
        else if(symbolCount<2)
           return false;

       else if(versalCount<2)
            return false;

       else
        return true;
    }
}
