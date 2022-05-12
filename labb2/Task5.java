/*      Kurs: 1IK143
        Laboration: Labb2:5
        Kursdeltagare: Jonathan Berg jb223pt
        Termin och datum: 21HT 27/9

 */

import java.util.Arrays;
import java.util.Random;

public class Task5 {


    public static void main(String[] args) {
        int[] bubbleArray = new int[10000];
        int[] selectionArray = new int[10000];
        int[] quickArray = new int[10000];
    
        Random rand = new Random();

        
        //fyller original array med random nummer
        for(int y=0; y<bubbleArray.length;y++){
            bubbleArray[y] = rand.nextInt(1000);

        }
        //kopierar original array till 2 andra arrayer
        System.arraycopy(bubbleArray,0,selectionArray,0,selectionArray.length);
        System.arraycopy(bubbleArray,0,quickArray,0,quickArray.length);

        /*check för att se så de är lika
        System.out.println("array1: "+ bubbleArray[0]);
        System.out.println("array2: "+ selectionArray[0]);
        System.out.println("array3: "+ quickArray[0]);*/

        //sortera bubbleArray med bubbleSort
        bubbleArray=bubbleSort(bubbleArray,bubbleArray.length);

        //sortera selectionArray med selectionSort
        selectionArray= selectionSort(selectionArray,selectionArray.length);



        long start = System.nanoTime();
        //sortera quickArray
        Arrays.sort(quickArray);

        long end= System.nanoTime();
        long sum= (end-start);
        System.out.println("Quicksort in nanosecs: "+ sum);






        /* kan användas för att se så sorteringen fungerar
        for (int x=0;x<20;x++){
            System.out.println("1: "+bubbleArray[x]+"\t2: "+selectionArray[x] +"\t3: "+quickArray[x]);
        }*/
    }

    public static int[] bubbleSort(int[] arr,int n){

        //avskriven ifrån https://www.geeksforgeeks.org/bubble-sort/ under "optimized java bubblesort"
        int i,j,temp;
        boolean swapped;
        long startTime= System.nanoTime();
        for( i=0;i<n-1;i++) {

            swapped=false;

            for (j = 0; j<n-i-1; j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if (swapped==false)
                break;
        }
        long endTime= System.nanoTime();
        long elapsedTime = (endTime - startTime);
        System.out.println("Time elapsed for bubblesort in nanoseconds: " +(elapsedTime));
        return  arr;
    }
    public static int[] selectionSort(int[] arr,int n){
        //avskriven ifrån https://www.geeksforgeeks.org/selection-sort/             Java implementation of selection sort by Rajat Mishra
        long start=System.nanoTime();

        for (int i=0;i<n-1;i++){
            int min= i;
            for (int j=i+1;j<n;j++)
                if (arr[j] < arr[min])
                    min=j;
            int temp= arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }
        long end=System.nanoTime();
        long sum= end-start;
        System.out.println("Selectionsort in nanosec: "+ sum);
        return arr;
    }

}
