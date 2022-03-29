import java.util.Scanner;
import java.util.Random;
public class bars {
  public static void main (String[] args) {
  Scanner console = new Scanner(System.in);
  Random rand = new Random();
  int x = rand.nextInt(2);
  int bars = 21;
  int n;
  System.out.println("Bars 21 Game, each player picks 1,2 or 3 bars");
  while(bars > 1){
      if(x%2==1){
         System.out.printf(" Bars = %d",bars);
         System.out.printf("  Player A picks: ");
         n = console.nextInt();
         if(n>=1 && n<=3){
            bars = bars - n;
            x++;
            }
         else while(n<1 || n>3){
            System.out.printf(" Bars = %d",bars);
            System.out.printf("  Player A picks: ");
            n = console.nextInt();
            if(n>=1 && n<=3){
               bars = bars - n;
               x++;
               }
            }
         }
      else{
         System.out.printf(" Bars = %d",bars);
         System.out.printf("  Player B picks: ");
         n = console.nextInt();
         if(n>=1 && n<=3){
            bars = bars - n;
            x++;
            }
         else while(n<1 || n>3){
            System.out.printf(" Bars = %d",bars);
            System.out.printf("  Player B picks:");
            n = console.nextInt();
            if(n>=1 && n<=3){
               bars = bars - n;
               x++;
               }
            }
         }
      }
     if(bars<=0){
         if(x%2==0){
            System.out.printf("Player B wins!!");
            }
         else{
            System.out.printf("Player A wins!!");
            }
         }
     else if(bars==1){
         if(x%2==0){
            System.out.printf("Player A wins!!");
            }
         else{
            System.out.printf("Player B wins!!");
            }
         }
   }
  
  }