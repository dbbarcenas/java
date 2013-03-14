
package spotlight;

import java.util.Scanner;
public class LabWeek8DB {

   
    public static void main(String[] args) {
        float sales ,commissionRate, advancedPay, pay;           //local variable
        
        sales = getSales(); //get the amout of sales
        advancedPay = getAdvancedPay(); // get the amout of advanced pay 
        commissionRate = determineCommissionRate (sales);   //determine the commission rate.
        pay = advancedPay - sales * commissionRate ;    //calculate the pay. 
        
        System.out.printf("\nThe pay is $%.2f", pay);    //display the amout of pay
            
        if (pay < 0)    //Determine whether the pay is negative. 
        {
            System.out.println("\nThe sales person must reimburse");
            System.out.println("the company.");
        }

    }      
      
    // The getSales function gets a salesperson's 
    //monthly sales from the user and returns
    //that values as a Real.
    public static float getSales(){
        float monthlySales;    // Local variable to hold the monthly sales 
        
        // get the amount of mothly sales. 
        Scanner inputSales = new Scanner(System.in);        
        System.out.println("Enter the salesperson's monthly sales:");
        monthlySales = inputSales.nextFloat();
        
        // return the amount of monthly sales. 
        return monthlySales;
    }
    
    // the getAdvancedPay function gets the amount of 
    //advanced pay given to the salesperson and 
    //return that amount as a Real. 
    public static float getAdvancedPay(){
        //Local Variable to hold the advanced pay. 
        float advanced;
        
        // Get the amount of advanced pay. 
        Scanner inputAdvanced = new Scanner(System.in);
        System.out.println("Enter the amountof advanced pay, or 0 if no advanced pay was given.");
        advanced = inputAdvanced.nextFloat();
        
        return advanced;    // return the advanced Pay. 
    }
    
    // The determineCommissionRate function accepts the
    //amount of sales as an argument and returns the 
    //commission rate of a Real. 
    public static float determineCommissionRate(float sales){
        float rate;    //Local variable to hold commission rate. 
        
        // Determine the commission rate. 
        if (sales < 10000.00f){
            rate = 0.10f; 
        System.out.printf("\nYour commission is 10%%.");}
        else if (sales >= 10000.00f & sales <=14999.99f){
            rate = 0.12f; 
        System.out.printf("\nYour commission is 12%%.");}
        else if (sales >=15000.00f & sales <=17999.99f){
            rate = 0.14f; 
        System.out.printf("\nYour commission is 14%%.");}
        else if (sales >= 18000.00f & sales <= 21999.99f){
            rate = 0.16f;
        System.out.printf("\nYour commission is 16%%.");}
        else {
            rate = 0.18f;
            System.out.printf("\nYour commission is 18%%.");}
       
        //Return the commission rate. 
       return rate; 
        
    }
    
   
}
