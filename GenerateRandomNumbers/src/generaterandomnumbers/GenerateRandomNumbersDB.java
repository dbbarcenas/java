
package generaterandomnumbers;

       import java.util.Random;

// Generate 100 random integers in the range 0-500. 
public final class GenerateRandomNumbersDB {
  
  public static final void main(String[] args){
    System.out.println("Generating 100 random numbers in range  of 0-500.");
    
    //note a single Random object is reused here
    Random randomGenerator = new Random();
    for (int number = 1; number <= 100; ++number){
      int randomInt = randomGenerator.nextInt(500);
      System.out.println("\nGenerated : " + randomInt);
      
      if (randomInt % 2 == 0 )
          System.out.println("Even Number");
      else
          System.out.println("Odd Number"); 
    }
    
    System.out.println("\nDone.");
  }
 
}
    
