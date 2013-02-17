

package forloop;


public class Forloop {

   
    public static void main(String[] args) {
        
        for (int dayofMonth =1; dayofMonth <=28; dayofMonth++){
            
          System.out.printf("\nFebuary %d", dayofMonth);
          
            if (dayofMonth == 14)
                {System.out.print(" - Valentines Day");}
       }
    } 
}
