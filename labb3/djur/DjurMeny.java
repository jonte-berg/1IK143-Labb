/*Kurs: 1IK143
        Laboration: Labb3:8
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 28/10
        */
package djur;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DjurMeny {
    public static void main(String[] args) {
        int input = 0;
        String input2;
        ArrayList<Djur> djurList = new ArrayList<>();
        double tempDouble;
        while (input != 3) {
            Scanner scan = new Scanner(System.in);

            System.out.println("\n\nDjurmeny\n========\n1. Visa djur i ordning \n2. Lägga till ett djur\n3. Avsluta");
            input = scan.nextInt();
            scan.nextLine();

            switch (input) {

                case (1):
                    System.out.println("du gav " + input);
                    djurList=readList();
                    for (int i=0;i<djurList.size();i++)
                        System.out.println(djurList.get(i).utskrift());
                    break;

                case (2):
                    System.out.println("Vilket slags djur vill du skapa?");
                    System.out.println("1.Däggdjur\n2.Fågel\n3.Reptil");
                    input = scan.nextInt();

                    switch (input) {

                        case (1):


                            System.out.println("Däggdjur...");
                            Daggdjur temp = new Daggdjur();
                            scan.nextLine();
                            System.out.println("Ange namn: ");

                            input2= scan.nextLine();
                            temp.setNamn(input2);

                            System.out.println("Ange Latinkst namn: ");
                            input2 = scan.nextLine();
                            temp.setLatinsktNamn(input2);

                            System.out.println("Ange Vikt(double) : ");
                            input2=scan.nextLine();
                            tempDouble= Double.parseDouble(input2);
                            temp.setVikt(tempDouble);

                            System.out.println("Ange pälsfärg: ");
                            input2 = scan.nextLine();
                            temp.setPalsfarg(input2);

                            System.out.println("har den vinterpäls? (j/n)");
                            input2= scan.nextLine();
                            if(input2.toLowerCase().charAt(0)!='n')
                            temp.setHarVintepals(true);
                            else
                                temp.setHarVintepals(false);
                            System.out.println("hur låter den?");
                            input2=scan.nextLine();
                            temp.setLate(input2);
                            System.out.println(temp.export());
                            djurList.add(temp);
                            writeList(djurList);
                            break;
                        case (2):
                            Fagel tempf = new Fagel();
                            scan.nextLine();
                            System.out.println("Ange namn: ");

                            input2= scan.nextLine();
                            tempf.setNamn(input2);

                            System.out.println("Ange Latinkst namn: ");
                            input2 = scan.nextLine();
                            tempf.setLatinsktNamn(input2);

                            System.out.println("Ange Vikt(double) : ");
                            input2=scan.nextLine();
                            tempDouble= Double.parseDouble(input2);
                            tempf.setVikt(tempDouble);

                            System.out.println("Är det flyttfågel? (j/n)");
                            input2 = scan.nextLine();
                            if(input2.toLowerCase().charAt(0)!='n')
                            tempf.setArFlyttfagel(true);
                            else
                                tempf.setArFlyttfagel(false);

                            System.out.println("Kan den flyga? (j/n)");
                            input2 = scan.nextLine();

                            if(input2.toLowerCase().charAt(0)!='n')
                            tempf.setKanFlyga(true);
                            else
                                tempf.setKanFlyga(false);
                            System.out.println("Beskriv redet: ");
                            input2=scan.nextLine();
                            tempf.setRedetyp(input2);
                            System.out.println("Hur låter den? ");
                            input2=scan.nextLine();
                            tempf.setLate(input2);



                            System.out.println(tempf.export());
                            djurList.add(tempf);
                            writeList(djurList);
                            break;
                        case (3):
                            Reptil tempr = new Reptil();
                            scan.nextLine();
                            System.out.println("Ange namn: ");

                            input2= scan.nextLine();
                            tempr.setNamn(input2);

                            System.out.println("Ange Latinkst namn: ");
                            input2 = scan.nextLine();
                            tempr.setLatinsktNamn(input2);

                            System.out.println("Ange Vikt(double) : ");
                            input2=scan.nextLine();
                            tempDouble= Double.parseDouble(input2);
                            tempr.setVikt(tempDouble);
                            System.out.println("Beskriv levnadsmiljön: ");
                            input2 = scan.nextLine();
                            tempr.setLevnadsmiljo(input2);

                            System.out.println("Är den giftig (j/n)");
                            input2 = scan.nextLine();

                            if(input2.toLowerCase().charAt(0)!='n')
                                tempr.setGiftig(true);
                            else
                                tempr.setGiftig(false);


                            System.out.println("Hur låter den? ");
                            input2=scan.nextLine();
                            tempr.setLate(input2);



                            System.out.println(tempr.export());
                            djurList.add(tempr);
                            writeList(djurList);

                            //för att inte bryta while loopen
                            input=0;
                            break;

                    }

                    break;

                case (3):
                    System.out.println("Programmet avslutas, hejdå! ");
                    djurList=readList();

                    System.exit(0);
                    break;


            }
        }


    }

    public static ArrayList<Djur> readList() {
        ArrayList<Djur> temp = new ArrayList<>();

        try {
            File djurFile = new File("C:/Users/JBerg/IdeaProjects/week1/labb3/src/djur/djur.txt");
            Scanner reader = new Scanner(djurFile);
            while (reader.hasNextLine()) {
                String s = reader.nextLine();
                List<String> sList = new ArrayList<>(Arrays.asList(s.split(",")));
                if (s.charAt(0) == 'D') {
                    Daggdjur tempD = new Daggdjur();
                    tempD.setNamn(sList.get(1));
                    tempD.setLatinsktNamn(sList.get(2));
                    //omvandla till double
                    Double value =Double.parseDouble(sList.get(3).replaceAll("[^0-9]", ""));

                    // /10 pga översättningsfel med min regex (den lägger till en 0a varje read/write)
                        tempD.setVikt(value/10);
                     tempD.setPalsfarg(sList.get(4));
                     //omvandla till boolean
                     tempD.setHarVintepals(sList.get(5).contains("true"));
                     tempD.setLate(sList.get(6));
                     temp.add(tempD);
                } else if (s.charAt(0) == 'F') {
                    Fagel tempF = new Fagel();
                    tempF.setNamn(sList.get(1));
                    tempF.setLatinsktNamn(sList.get(2));
                    //double
                    Double value =Double.parseDouble(sList.get(3).replaceAll("[^0-9]", ""));

                    // /10 pga översättningsfel med min regex (den lägger till en 0a varje read/write)
                    tempF.setVikt(value/10);
                 //boolean
                    tempF.setArFlyttfagel(sList.get(4).contains("true"));
                    tempF.setKanFlyga(sList.get(5).contains("true"));
                    tempF.setRedetyp(sList.get(6));
                    tempF.setLate(sList.get(7));
                    temp.add(tempF);
                } else if (s.charAt(0) == 'R') {
                    Reptil tempR = new Reptil();
                    tempR.setNamn(sList.get(1));
                    tempR.setLatinsktNamn(sList.get(2));
                    //double
                    Double value =Double.parseDouble(sList.get(3).replaceAll("[^0-9]", ""));
                    // /10 pga översättningsfel med min regex (den lägger till en 0a varje read/write)
                    tempR.setVikt(value/10);
                    //boolean
                    tempR.setLevnadsmiljo(sList.get(4));
                    tempR.setGiftig(sList.get(5).contains("true"));
                    tempR.setLate(sList.get(6));
                    temp.add(tempR);
                }
               // System.out.println(s);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error occured, file not found");
            e.printStackTrace();
        }
        Collections.sort(temp);
        return temp;
    }

    public static void writeList(ArrayList<Djur> x) {
        String newTxt = "";
        try {


            File original = new File("C:/Users/JBerg/IdeaProjects/week1/labb3/src/djur/djur.txt");
            //File newFile = new File("C:/Users/JBerg/IdeaProjects/week1/labb3/src/djur/djurTemp.txt");
            for (int i = 0; i < x.size(); i++) {
                newTxt += x.get(i).export();
                newTxt += "\n";
            }


            FileWriter writer = new FileWriter(original);
            writer.append(newTxt);
            writer.flush();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
