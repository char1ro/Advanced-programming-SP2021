public class Main {
      static void recursive(int n) {
      if (n>0){
         recursive(n/2);
         system.out.print(n%2);
         }
      }
      public static void main(String[] args) {
            recursive(13);
      }                                     
}