import java.util.Scanner;
public class LabProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(true){
            for(int i = line.length()-1;i >= 0;--i){
                System.out.print(line.charAt(i));
            }
            System.out.println("");
            line = sc.nextLine();
            if((line.equals("d"))||(line.equals("done"))||(line.equals("Done"))){
                break;
            }
        }
    }
}
