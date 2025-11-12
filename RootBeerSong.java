public class RootBeerSong {
   public static void main(String[] args) {
      singRootBeerSong(5);
   }
   public static void singRootBeerSong(int numOfBottles){
      while (numOfBottles > 0) {
         System.out.println(numOfBottles + " bottles of root beer on the wall");
         System.out.println(numOfBottles + " bottles of root beer");
         System.out.println("Take one down, pass it around");
         System.out.println((numOfBottles-1) + " bottles of root beer on the wall\n");
         numOfBottles--;
      } 
   }
}