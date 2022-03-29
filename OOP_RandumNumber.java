import java.util.Scanner;
import java.util.Random;

public class OOP_RandumNumber{
   int x;
      OOP_RandumNumber(){
      Random rand = new Random();
      x = rand.nextInt(100)+1;
   }
   public void game(){
      Scanner console = new Scanner(System.in);
      int low = 1, high = 100;
      int n;
      do{
         do{
            //System.out.println(x); // tester 
            System.out.printf("Enter guess number between %d to %d: ",low,high);
            n = console.nextInt();
         }
         while(n<low||n>high);{
            if(n>x){
            high = n;
            }
            else{
            low = n;
            }
         }
      }
         while(x!=n && low!=high-2);{
            if(n==x){
               System.out.printf("You win!!! the random number was %d",x);
            }
            else if (low==high-2){
               System.out.printf("You lose, the random number is %d",x);
            }
         }
   }
   public static void main (String[] args){
      new OOP_RandumNumber().game();
   }  
}