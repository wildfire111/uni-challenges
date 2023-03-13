import java.util.*;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] target = {'e','n','j','o','y'};
        boolean found = false;
        for(int i=0;i<6;++i){
            if(i==0){
                System.out.println("Please enter your first attempt.");
            } else {
                System.out.println("\nPlease try again: ");
            }
            String guessLine = sc.nextLine();
            char[] guess = guessLine.toCharArray();
            if((!(Arrays.equals(guess,target)))&&(i==5)){
                System.out.print("\nBetter luck next time");
                break;
            }
            char[] output = new char[5];
            for(int j=0;j<5;++j){
                //System.out.println(guess[j]+" "+target[j]);
                if(guess[j]==target[j]){
                    output[j] = guess[j];
                } else {
                    output[j] = 'X';
                }
            }
            int[] indexBrackets = {-1,-1,-1,-1,-1};
            int distance = 0;
            for(int j=0;j<5;++j){
                for(int k=0;k<5;++k){
                    if(j==k){
                        continue;
                    }
                    //System.out.println(guess[j]+" "+guess[k]);
                    if(guess[j]==target[k]){
                        indexBrackets[j] = 1;
                        int guessj = (int)(guess[j]);
                        //System.out.println(guess[j]+" "+guessj);
                        int targetj = (int)(target[j]);
                        //System.out.println(target[k]+" "+targetk);
                        distance = Math.abs(guessj-targetj);
                    }
                }
            }
            String outputString = "";
            for(int j=0;j<5;++j){
                if(indexBrackets[j]!=-1){
                    outputString += "(";
                    outputString += guess[j];
                    outputString += ")";
                } else {
                    outputString += output[j];
                }
            }
            System.out.println(guessLine);
            boolean printDistance = false;
            if(outputString.equals(guessLine)){
                System.out.println("Congratulations, you found the word.");
                break;
            } else {
                System.out.println(outputString);
                for(int indexNumber : indexBrackets){
                    if(indexNumber!=-1){
                        printDistance = true;
                    }
                }
                if(printDistance==true){
                    System.out.println("One of your letters is "+distance+" characters away");
                }
        }
        }
    }
}