/*      Kurs: 1IK143
        Laboration: Labb2:6
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 29/9

 */
public class Task6 {
    public static void main(String args[]) {
        int[][] grid = new int[8][8];
        int traversed=0; //när myran når en "ny" position så adderas denna variabel
        int count = 0; // totala mängd steg som myran går (obs att ett out of bounds steg inte räknas)
        int x = (int)(Math.random()*8); //vart myran ska starta X-led
        int y = (int)(Math.random()*8); //vart myran ska starta Y-led
        int masterIteration=0;
        int[] simulationData= new int[10];

        while(masterIteration<10){
            System.out.println("Myrans startposition X: "+x + "\nMyrans startposition Y: "+y);
        while((true)) //infinity loop som sköter en simulation i simulatorn tills alla schackbrädspositioner är "upptäckta"
        {
            //randomroll 0-3 (+1)  representerar de fyra alternativ som myran kan ta upp/ner/vänster/höger
            int random =  (int)(Math.random()*4)+1;

            //switch baserat på vilken direction myran tar 1-4 (1-4 representerar vilket håll myran går)
            switch(random){

                //VÄNSTER-roll
            case (1):

                x--; //gå ett steg till vänster (-1 i X-led)

                //om x<0 så har du gått out-of-bounds, då ska steget EJ RÄKNAS, SAMT  att myran återgår till den URSPRUNGLIGA positionen INNAN rollen
                if(x < 0 ){
                    //System.out.println("ant out of bounds! THIS SHOULDNT COUNT");
                    count--;
                    x++;
                }

                //om myran hållt sig inom schackbrädet
                //skriver ut värdet på schackbrädets position
                //System.out.println(grid[x][y]);

                //(ifall det är 0 är det first time!, alla värden över 0 representerar hur många gånger myran varit på denna position)
                if(grid[x][y]==0)
                    traversed++;




                // (felsökning)  System.out.println("move left");
                // (felsökning) System.out.println("this is x value: "+ x);
                // (felsökning)  System.out.println("this is y value: "+ y);
                /* (felsökning)
                for(int i=0;i<grid.length;i++) {
                    System.out.println(grid[0][i]+ " " + grid[1][i]+ " " +grid[2][i]+ " " +grid[3][i]+ " " +grid[4][i]+ " " +grid[5][i]+ " " +grid[6][i]+ " " +grid[7][i]);

                }*/
                break;

                //HÖGER-roll
         case (2):

                x++; //gå ett steg till höger (+1 i X-led)

                //om x>= grid.length så har du gått out-of-bounds, då ska steget EJ RÄKNAS, SAMT  att myran återgår till den URSPRUNGLIGA positionen INNAN rollen
                if(x >= grid.length){
                    x--;
                    //System.out.println("ant out of bounds! THIS SHOULDNT COUNT");
                    count--;
                }

                //om myran hållt sig inom schackbrädet
                //skriver ut värdet på schackbrädepositionen (felsökning)
                // System.out.println(grid[x][y]);

                //(ifall det är 0 är det first time!, alla värden över 0 representerar hur många gånger myran varit på denna position)
                if(grid[x][y]==0)
                    traversed++;
                /*
                System.out.println("move right"); // (felsökning)
                System.out.println("this is x value: "+ x); // (felsökning)
                System.out.println("this is y value: "+ y); // (felsökning)

                // (felsökning)
                for(int i=0;i<grid.length;i++) {
                    System.out.println(grid[0][i]+ " " + grid[1][i]+ " " +grid[2][i]+ " " +grid[3][i]+ " " +grid[4][i]+ " " +grid[5][i]+ " " +grid[6][i]+ " " +grid[7][i]);

                }
                */
                break;


                //NER-roll
         case (3):
                //gå ett steg NER (-1 i Y-led)
                y--;

                //om x<0 så har du gått out-of-bounds, då ska steget EJ RÄKNAS, SAMT  att myran återgår till den URSPRUNGLIGA positionen INNAN rollen
                if(y < 0){
                    y++;
                   // System.out.println("ant out of bounds! THIS SHOULDNT COUNT");
                    count--;
                }
                //skriver ut värdet på schackbrädepositionen (felsökning)
                // System.out.println(grid[x][y]);

                //(ifall det är 0 är det first time!, alla värden över 0 representerar hur många gånger myran varit på denna position)
                if(grid[x][y]==0)
                    traversed++;
                /*
                System.out.println("move down"); // (felsökning)
                System.out.println("this is x value: "+ x); // (felsökning)
                System.out.println("this is y value: "+ y); // (felsökning)

                // (felsökning)
                for(int i=0;i<grid.length;i++) {
                    System.out.println(grid[0][i]+ " " + grid[1][i]+ " " +grid[2][i]+ " " +grid[3][i]+ " " +grid[4][i]+ " " +grid[5][i]+ " " +grid[6][i]+ " " +grid[7][i]);

                }
                */

                break;

            case (4):
                y++;
                if(y >= grid[x].length){
                    y--;
                   // System.out.println("ant out of bounds! THIS SHOULDNT COUNT");
                    count--;
                }
                //felsökning
                //System.out.println(grid[x][y]);
                if(grid[x][y]==0)
                    traversed++;

                System.out.println("move up");
                System.out.println("this is x value: "+ x);
                System.out.println("this is y value: "+ y);
                for(int i=0;i<grid.length;i++) {
                    System.out.println(grid[0][i]+ " " + grid[1][i]+ " " +grid[2][i]+ " " +grid[3][i]+ " " +grid[4][i]+ " " +grid[5][i]+ " " +grid[6][i]+ " " +grid[7][i]);

                }
                break;



        }


            count++; //steget räknas
            grid[x][y]++; //myran har besökt x,y koordinat +1 gång
            if(traversed==64) //om alla möjliga positioner är besökta breakas infinity loopen och nästa simulation kan påbörjas
              break;
        }

            System.out.println("Number of Steps in this simulation: " + count);

            //rita ut brädet
            /*
            for(int i=0;i<grid.length;i++) {
            //System.out.println(grid[0][i]+ " " + grid[1][i]+ " " +grid[2][i]+ " " +grid[3][i]+ " " +grid[4][i]+ " " +grid[5][i]+ " " +grid[6][i]+ " " +grid[7][i]);
            System.out.println((boolean)(grid[0][i]>0)+ " " +(boolean)(grid[1][i]>0)+ " "+(boolean)(grid[2][i]>0)+ " "+ (boolean)(grid[3][i]>0)+ " "+ (boolean)(grid[4][i]>0)+" "+
                    (boolean)(grid[5][i]>0)+ " "+ (boolean)(grid[6][i]>0)+ " " + (boolean)(grid[7][i]>0));

            }

             */

            //variable reset inför nya simulationen
            masterIteration++;
            simulationData[masterIteration-1]=count;
            count=0;
            traversed=0;
            x = (int)(Math.random()*8); //nästa simulation så startar myran på en random position
            y =(int)(Math.random()*8); //nästa simulation så startar myran på en random position

            //grid-reset (kanske går snabbare med kopior istället för att reset manuellt.
            for (int z = 0; z< grid.length; z++) {
                for (int v = 0; v < grid[z].length; v++) {
                    grid[z][v] = 0;
                }

            }

    }



        //skriver ut resultaten ifrån de sparade simulationerna
        for (int h=0;h<simulationData.length;h++)
        System.out.println("Simulation "+ (h+1) + ": "+ simulationData[h]);}
}

