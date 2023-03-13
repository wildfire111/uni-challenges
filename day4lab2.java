import java.util.Scanner;
public class ProgramSummary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%-14s%-14s%-14s%-14s%-14s\n","","Bronze","Silver","Gold","Platinum");
        System.out.printf("%-14s%-14s%-14s%-14s%-14s\n","Score Range","500 - 999","1000 - 1999","2000 - 2999","3000 +");
        System.out.println("\nPlease enter the user's score:");
        int userScore = sc.nextInt();
        if (userScore < 500){
            System.out.println("You have not yet made it into a league");
        } else if (userScore < 1000){
            System.out.println("Congratulations you have made it into the Bronze!!!");
        } else if (userScore < 2000){
            System.out.println("Congratulations you have made it into the Silver!!!");
        } else if (userScore < 3000){
            System.out.println("Congratulations you have made it into the Gold!!!");
        } else {
            System.out.println("Congratulations you have made it into the Platinum!!!");
        }

    }
}