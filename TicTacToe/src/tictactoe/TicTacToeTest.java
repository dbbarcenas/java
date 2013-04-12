
package tictactoe;
/*
*Durwin Barcenas
*student num: 200203740
*/
import java.util.Scanner;


public class TicTacToeTest {
   private int[][] gameBoard = new int[3][3]; // global 2d variable for the gameBoard
   private int moves = 0;
   
   TicTacToeTest(){ // TicTacToe constructor 
       for (int row = 0; row < 3; row++){    // loop through the rows
         for (int col = 0; col < 3 ; col ++){  // loop through the columns 
           gameBoard [row][col]= 0;    // initializez gameBoard array to *
           }    // end of inner loop
       }    // end of outer loop
   }    // end of the constructor 
   
  // this method displays the output of the gameboard 
   // into a 3 by 3 cell 
   public void displayBoard(){
       System.out.println();
            for (int row = 0; row < 3; row++) { // a for loop that loops thorugh the rows
            for (int col = 0; col < 3; col++) { // a for loop that loops through the columns 
               if(gameBoard[row][col] == 0){    // if the value is 0, then outputs *, and tab over 
                    System.out.printf("\t*");
                }//end of statement
                if(gameBoard[row][col] == 1){    // if the value is 1 then output X
                 System.out.printf("\tX");
                }// end of if statement
                if(gameBoard[row][col] == 5){    // if hte value is 5 then output O
                 System.out.printf("\tO");
                }//end of if statement
            }   // end of inner for loop 
            System.out.println();
        }   // end of outer for loop 
   }   // end of displayBoard method 
   
   // the method boardFull validates the gameBoard if the
   // baord is full and returns true, or false otherwise 
    public boolean boardFull(){
        int spaceLeft = 9;     //declare the tota spaces left as a variable with a value of 9 
        
        for(int row = 0; row < 3; row++)  {   // loops through the rows
            for(int col = 0; col < 3; col++){    // loops through the columns            
                if(gameBoard[row][col] != 0){    // if the gameBoard is negated equals to 0 
                   spaceLeft =-1;           // then minus from the spaceLeft to 1
                }
            }//end of inner loop
        }// end of outer loop
        if(spaceLeft ==0)   //if spaceLeft is equals to 0 
        {   
          return true;      // returns the value as true
        }//end of if statement 
        else{ // otherwise 
            return false;   // return the value as false 
        }//end of else statement
    }//end of boardFull
    
    // this method initializes the player's input to an 
    // integer playerTurn for player's 1 and 2 Turns. 
    // Each player must enter the coordinates, 
    // if the input is invalid then they must enter the right
    // value in order to move on 
    public void makeMove(int playerTurn){
        boolean valid;  //boolean for the valid input, either true or false 
        int row, col = 0;   // declare integer for rows and columns
        Scanner keyboard = new Scanner(System.in);        // declare a new scanner object called keyboard

            if(playerTurn == 1) // if playerTurn is equals to 1, then it's player 1's turn to input the coordinates 
            {
                System.out.printf("Please input the coordinates Rows (1-3) Column (1-3), Player 1:");   
                row = keyboard.nextInt();       // saves the player's input into the row variable
                col = keyboard.nextInt();   //saves the player's input into the col variable 
                valid = validMove(row,col); // validMove method receives two values, and decides weather it's valid or invalid
                
                while(!valid)   // while negated valid, must re-input the right coordinates 
                {
                    System.out.printf("Invlaid Input, Please re-type values (1-3) for Rows and Columns: ");   
                    row = keyboard.nextInt();  // saves the player's input into the row variable
                    col = keyboard.nextInt();   //saves the player's input into the col variable 
                    valid = validMove(row,col); // validMove method checks again if the re-typed value is valid 
                }//end of while loop
                
                gameBoard[row-1][col-1] = 1;    // sets the value of the gameBoard at row-1 and col-1 to be 1, so it's an X
                moves =+1;  //adds 1 to moves
            }// end of if
            if(playerTurn == 2)  {  // if playerTurn is equals to 2, then it's player 2s turn to input the coordinates 
                System.out.printf("Please input the coordinates Rows (1-3) Column (1-3), Player 2: ");
                row = keyboard.nextInt();// saves the player's input into the row variable
                col = keyboard.nextInt();//saves the player's input into the col variable 
                valid = validMove(row,col); // validMove method receives two values, and decides weather it's valid or invalid
                
                while(!valid){
                    System.out.printf("Invlaid Input, Please re-type values (1-3) for Rows and Columns: ");
                    row = keyboard.nextInt();    // saves the player's input into the row variable
                    col = keyboard.nextInt();   //saves the player's input into the col variable 
                    valid = validMove(row,col); // validMove method checks again if the re-typed value is valid 
                }
                gameBoard[row-1][col-1] = 5;    // sets value of gameBoard at row-1 and col -1 to be 5 for player 2
                moves +=1;  //adds 1 to moves
            }//end of if statement
    }   // end of method makeMove
    
   //method validMove accepts row and column position and
    //validates if the row and column are both integer values between 1 and 3. 
    // The method also validates the user's choice is available, if all validation 
    // passes then returns true
    public boolean validMove(int row, int col){
        if((row > 3 || row < 1) || (col > 3 || col < 1)){  // if the value inputed for row and column is not within (1-3) then 
         return false;   //return false
        }//end of if statement
        if(gameBoard[row-1][col-1] != 0){   // if gameBoard row-1 col-1 negates equals to 0 then 
        return false;   //return false
        } return true;    // if fals hase not been returned first, then return true
    }//end of method
    
   // method isGameComplete will check for a tie or a winner and return a string of each element in the row
    public String isGameComplete(){
        String decision = "NO";  // create a decesion set as "NO"
        int value = 0;  //declare a variable value into 0 
        
        for(int row = 0; row < 3; row++){   // loops through the rows 
         for(int col = 0; col < 3; col++) {   //loops throught he columns 
                    value += gameBoard[row][col];   //add a value to gameBoard array 
            }   //end of inner for loop
            
                 decision = checkIfWinner(value); //decision passes the value to checkIfWInner, then sets a decision for a return 
                 value = 0;      // sets the value back to 0 
            if(!decision.equals("NO")){   //if the decision is not equals to NO, returns the decision
                    return decision;
            }//end of if statement 
        }//end of outer for loop
        
        for(int col = 0; col < 3; col++){    // loops through the coloumns 
            for(int row = 0; row < 3; row++){    //loop trhough the rows 
                     value += gameBoard[row][col];    //add a value to gameBoard array 
            }//end of inner loop
            
           decision = checkIfWinner(value);  //decision passes the value to checkIfWInner, then sets a decision for a return 
            value = 0;  // value is equal to 0
            if(!decision.equals("NO")) {  //if decision doesn't equal NO, return decision
                 return decision; //return decision
            }//end of if
        }//end of outter loop
        
        for(int row = 0; row < 3; row++){    //loop through rows
            value += gameBoard[row][row];  // checks from top left to bottom right
        }   //end of for loop
        
             decision = checkIfWinner(value); //check's if theres a winner 
             value = 0;  //set value to 0
        if(!decision.equals("NO")) {  //if winner has been decided then reutrn to who won 
            return decision; //return if theres a winner or not 
        }//end of if statement 
        
            value +=gameBoard[2][0]+gameBoard[1][1]+gameBoard[0][2];   
            decision = checkIfWinner(value); //check if someone won
             value = 0;  //set value back to 0
        
        if(!decision.equals("NO")){   //if someone won then return to the player who won 
            return decision; //return winner
        }//end of if statement 
        if(boardFull()){ //call boardFull method to see if the baord is full then decides 
            decision = "TIE"; //decides the outcome as a tie 
           return decision; //return the decision value 
        }//end of if statement
       return decision;  //otherwhise return the default decision to NO 
   }   // end of isGameComplete
    
    // checkIfWinner validates the string passed has either "XXX" or "OOO" int it.
    // If someone won then it returns the to the winning player. IF there is no
    // winner then should return "No"
    public String checkIfWinner(int value){
        String decision = "NO";  //set default vaule of verdict to NO
        
        if(value == 3){ // if the value is equals to 3 
            decision = "X"; // then decision is set to X
                }//end of if
                     else if(value == 15){   // if value is equals to 15 
                        decision= "O";  // then decision is set to O 
                         }//end of else if
                      else{   // otherwise 
             decision= "NO"; // decision is set to O 
        }   //end of else
        
        return decision; //decesion returned 
    }   //end of method 
    
}   //end of public class 


    