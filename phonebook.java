import java.util.Scanner;

public class Phonebook {
    public static void main (String [] args) {
        String phoneNumber;
        int i = 0;
        int numberToChange;
        String phoneWord = "";
        Scanner sc = new Scanner(System.in);
        phoneNumber = scnr.nextLine();
        int numberLen = phoneNumber.length();
        while(i < numberLen){
            numberToChange = phoneNumber.charAt(i)
            if (i > 2){
                if (numberToChange == "1"){
                    phoneWord.concat("A")
                } else if (numberToChange == "2"){
                    phoneWord.concat("D")
                } else if (numberToChange == "3"){
                    phoneWord.concat("G")
                } else if (numberToChange == "4"){
                    phoneWord.concat("J")
                } else if (numberToChange == "5"){
                    phoneWord.concat("M")
                } else if (numberToChange == "6"){
                    phoneWord.concat("P")
                } else if (numberToChange == "7"){
                    phoneWord.concat("T")
                } else if (numberToChange == "8"){
                    phoneWord.concat("")
                } else if (numberToChange == "9"){
                    phoneWord.concat("D")
                }
            }
        }
}