import java.util.Scanner;
import java.util.Random;
public class RandomNumber {
  public static void main (String[] args) {
  Scanner console = new Scanner(System.in);
  Random rand = new Random();
  int x = rand.nextInt(100)+1;
  int low = 1, high = 100;
  //System.out.println(x); // tester 
  System.out.printf("Enter guess number between %d to %d: ",low,high);
  int n = console.nextInt();
   while(n != x){
      if(n > x && n < high){
         high = n;
            if (low == (high - 2)){
         System.out.printf("You Lose, the random number was %d",x);
         break;
         }
         System.out.printf("Enter guess number between %d to %d: ",low,high);
         n = console.nextInt();
         }
      else if (n < x && n > low){
         low = n;
            if (low == (high - 2)){
         System.out.printf("You Lose, the random number was %d",x);
         break;
         }
         System.out.printf("Enter guess number between %d to %d: ",low,high);
         n = console.nextInt();
         }
      else {
         System.out.printf("Enter guess number between %d to %d: ",low,high);
         n = console.nextInt();
         }
      }
      if(n == x){
         System.out.printf("You Win!!! the random number is %d",x);
      }
  }
}