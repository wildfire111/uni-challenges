import java.io.*;
import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements to be paired.");
        int elements = sc.nextInt();
        int seedNumber = sc.nextInt();
        int[] elementsTable = new int[elements*2];
        int[] randTable = new int[elements*2];
        for(int i = 0,j = 1; i<elementsTable.length;i+=2){;
            elementsTable[i] = j;
            elementsTable[i+1] = j;
            ++j;
        }
        //System.out.println(Arrays.toString(elementsTable));
        System.out.print("\n");
        for(int i = 0;i<elementsTable.length;++i){
            System.out.printf("%4d",elementsTable[i]);
            if(((i+1)%5==0)){
                System.out.print("\n");
            }
        }
        System.out.println("\nPlease enter a seed number for testing purposes.");
        int unusedNumbers = elementsTable.length;
        Random rand = new Random(seedNumber);
        for(int i = 0;i<elementsTable.length;i++){
            boolean foundNumber = false;
            while(foundNumber==false){
                int index = rand.nextInt(elementsTable.length);
                //System.out.println(index+" is the number generated");
                if(elementsTable[index]!=0){
                    randTable[i] = elementsTable[index];
                    elementsTable[index] = 0;
                    foundNumber = true;
                }
            }
        }
        System.out.print("\n");
        for(int i = 0;i<randTable.length;++i){
            System.out.printf("%4d",randTable[i]);
            if(((i+1)%5==0)){
                System.out.print("\n");
            }
        }
      
   }
}