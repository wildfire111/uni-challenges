import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String date = "";
        while(!date.equals("-1")){
            //System.out.println(date);
            int comma = date.indexOf(",");
            //System.out.println(comma);
            int space = date.indexOf(" ");
            //System.out.println(space);
            if((comma==-1)||(space==-1)){
                date = scnr.nextLine();
                continue;}
            int day = Integer.parseInt(date.substring(space+1,comma));
            int month = getMonthAsInt(date.substring(0,space));
            if(month==0){
                date = scnr.nextLine();
                continue;}
            int year = Integer.parseInt(date.substring(date.length()-4,date.length()));
            System.out.println(day+"-"+month+"-"+year);
            date = scnr.nextLine();
            //System.out.println(date);
        }

    }
}
