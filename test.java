import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
      double dayOneTemp = sc.nextDouble();
      int dayOneRain = sc.nextInt();
      int dayOneHumidity = sc.nextInt();
      System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
      double dayTwoTemp = sc.nextDouble();
      int dayTwoRain = sc.nextInt();
      int dayTwoHumidity = sc.nextInt();
      double dayOneScore = 0;
      double dayTwoScore = 0;
      if (dayOneTemp > 25){ //Scoring Day 1 temp
        dayOneScore += 3;
        System.out.println("1: Scoring temp 3");
      } else if (dayOneTemp >= 15){
        dayOneScore += 9;
        System.out.println("1: Scoring temp 9");
      } else {
        dayOneScore += 6;
        System.out.println("1: Scoring temp 6");
      }
      if (dayTwoTemp > 25){ //Scoring Day 2 temp
        dayTwoScore += 3;
        System.out.println("2: Scoring temp 3");
      } else if (dayTwoTemp >= 15){
        dayTwoScore += 9;
        System.out.println("2: Scoring temp 9");
      } else {
        dayTwoScore += 6;
        System.out.println("2: Scoring temp 6");
      }
      if (dayOneRain >= 9){ //Scoring Day 1 rain
        dayOneScore += 2;
        System.out.println("1: Scoring rain 2");
      } else if (dayOneRain >= 4){
        dayOneScore += 4;
        System.out.println("1: Scoring rain 4");
      } else {
        dayOneScore += 6;
        System.out.println("1: Scoring rain 6");
      }
      if (dayTwoRain >= 9){ //Scoring Day 2 rain
        dayTwoScore += 2;
        System.out.println("2: Scoring rain 2");
      } else if (dayTwoRain >= 4){
        dayTwoScore += 4;
        System.out.println("2: Scoring rain 4");
      } else {
        dayTwoScore += 6;
        System.out.println("2: Scoring rain 6");
      }
      if (dayOneHumidity >= 61){ //Scoring Day 1 humidity
        dayOneScore += 1;
        System.out.println("1: Scoring humidity 1");
      } else if (dayOneRain >= 46){
        dayOneScore += 2;
        System.out.println("1: Scoring humidity 2");
      } else {
        dayOneScore += 3;
        System.out.println("1: Scoring humidity 3");
      }
      if (dayTwoHumidity >= 61){ //Scoring Day 2 humidity
        dayTwoScore += 1;
        System.out.println("2: Scoring humidity 1");
      } else if (dayTwoRain >= 46){
        dayTwoScore += 2;
        System.out.println("2: Scoring humidity 2");
      } else {
        dayTwoScore += 3;
        System.out.println("2: Scoring humidity 3");
      }
      System.out.println("");
      System.out.println("Outcome score day 1: "+dayOneScore);
      System.out.println("Outcome score day 2: "+dayTwoScore);
      if (dayOneScore < dayTwoScore){
        System.out.println("The best day to hold your event is: Day 2");
      } else if (dayOneScore > dayTwoScore) {
        System.out.println("The best day to hold your event is: Day 1");
      } else {
        System.out.println("The best day to hold your even is: Day 1 or Day 2");
      }
   }
}