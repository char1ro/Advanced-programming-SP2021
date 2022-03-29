import java.util.Scanner;
import java.util.Random;
public class OOP_Bars21 {
   public static void game(Player pA, Player pB){
   System.out.println("Bars 21 Game, each player picks 1,2 or 3 bars");
   Random rand = new Random();
   int x = rand.nextInt(2);
      if (x%2==1){
         pA.take();
         x++;
      }
      else{
         pB.take();
         x++;
      }
      while(Player.bars>1){
         if (x%2==1){
            pA.take();
            x++;
         }
         else{
            pB.take();
            x++;
         }
      }
      if(Player.bars==0){
         if(x%2==0){
            System.out.printf("Player "+pB.player+" wins!!");
         }
         else{
            System.out.printf("Player "+pA.player+" wins!!");
         }
      }
   }
   public static void main(String[] args){
      Player pA = new Player("A");
      Player pB = new Player("B");
      Player.bars=21;
      game(pA,pB);
   }
}
class Player{
   String player;
   static int bars=21;
   Player(String player){
      this.player=player;
   }
   public void take(){
   Scanner console = new Scanner(System.in);
   int n;
      do{
         System.out.printf(" Bars = %d  ",bars);
         System.out.printf("Player "+player+" picks: ");
         n=console.nextInt();
      }
      while(n<1 || n>3);{
         bars=bars-n;
      }
   }
}