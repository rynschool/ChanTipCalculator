import java.util.Scanner;

public class ChanTipCalculator {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       System.out.print("Welcome to the tip calculator!");
       System.out.print("How many people are in your group?");
       int peopleAmount = scan.nextInt();
       scan.nextLine();

       System.out.print("What is the tip percentage? Please enter an integer!");
       int tipPercent = scan.nextInt();
       scan.nextLine();
       double number = 0;
       double addAmount = 0;
       while (number != -1){
          System.out.print("Please enter the cost of one of the meals. Type -1 to stop.");
          number = scan.nextDouble();
          if(number != -1){
             addAmount += number;
          }
          scan.nextLine();
       }

    }
}
