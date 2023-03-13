import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char searchChar = sc.next().charAt(0);
        String searchWord = sc.next();
        int count = 0;
        //System.out.println(searchChar);
        //System.out.println(searchWord);
        for(int i=0;i<searchWord.length();++i){
            if(searchWord.charAt(i)==searchChar){
                count++;
            }
        }
        System.out.print(count+" "+searchChar);
        if((count>1)||(count==0)){
            System.out.println("'s");
        }
        System.out.println("")

    }
}