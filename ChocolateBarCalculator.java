//Kevin Beni
//CSCE 145-009

//Import java
import java.util.Scanner;

public class ChocolateBarCalculator {
    public static void main(String[] args) {
    	
        //Create a scanner object 
        Scanner key = new Scanner(System.in);

        //User input
        System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
        
        //Input validation
        if (!key.hasNextInt()) 
        {
            System.out.println("Invalid value for amount! Exiting the program");
            System.exit(0);
        }

        int dollars = key.nextInt();

        //Negative input validation
        if (dollars < 0) 
        {
            System.out.println("Invalid value for amount! Exiting the program");
            System.exit(0);
        }

        //Initial purchase
        int chocolateBars = dollars; 
        int coupons = dollars;      

        //Coupon redemption 
        while (coupons >= 6) 
        {
            int additionalchocolateBars = coupons / 6;    
            chocolateBars += additionalchocolateBars;       
            coupons = (coupons % 6) + additionalchocolateBars; 
        }

        //Program display
        System.out.println("You can buy " + chocolateBars + " chocolate bars and will have " + coupons + " coupons left!");
    }
}