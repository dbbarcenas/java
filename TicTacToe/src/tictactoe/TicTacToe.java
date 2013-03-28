
package tictactoe;

//This class will instantiate a Tic Tac Toe test and allow 2 people to play the game
public class TicTacToeTest {
    public static void main(String[] args){
        
        String winner = "NO";
        
        TicTacToe myGame = new TicTacToe();
        myGame.displayBoard();

        //Loop through the user inputs until there is a tie or a winner
        while (winner.equals("NO"))
        {
            myGame.makeMove(1);
            myGame.displayBoard();
            
            //check if player 1 has won, if not, let player 2 go
            if (myGame.isGameComplete().equals("NO"))
            {
                myGame.makeMove(2);
                myGame.displayBoard();
            }
            
            winner = myGame.isGameComplete();
        }   //end of while loop
        
        
        //declare the winner and display it to the screen
        if (winner.equals("TIE"))
            System.out.println("\nIt's a tie!  Congratulations to both players.");
        else if (winner.equals("X"))
            System.out.print("\nCongratulations player 1 - you win!\n");
        else 
            System.out.print("\nCongratulations player 2 - you win!\n");
    }   //end of main method
}   //end of class TicTacToe Test * rough plan 
/ * 
 * 1    Set two dimensional arrays for the user's input. The input Should be either "O" or "X"
 * 2    Set a two dimensional array for the computer to generate random answer "O" or "X"
 * 3    Set a method that will compare the user's input and computer's random output
 * 4    Create a method that will display the output of it all 
 * 5    
 */

   
       
