//Kevin Beni
//CSCE 145-009

//Import java
import java.util.Scanner;
public class SoftwarePackage {

	public static void main(String[] args) {
        
		final double retailPrice = 99.0;

		//Create scanner object
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the total number of software packages ordered:");
        if (!key.hasNextInt()) 
        {
            System.out.println("Invalid value for package count! Exiting the program!");
            System.exit(0);
        }

        int quantity = key.nextInt();   

        //Input validation
        if (quantity < 10) 
        {
            System.out.println("Invalid value for package count! Exiting the program!");
            System.exit(0);
        }

        //Discount percentage 
        double discountPercentage;
        if (quantity >= 100)
        {
            discountPercentage = 0.50;
        } 
        else if (quantity >= 50) 
        {
            discountPercentage = 0.40;
        }
        else if (quantity >= 20) 
        { 
            discountPercentage = 0.30;
        }
        else 
        {
            discountPercentage = 0.20;
        }
        
        //Discount percentage calculation
        double totalBefore = quantity * retailPrice;
        double discountAmount  = totalBefore * discountPercentage;
        double totalAfter   = totalBefore - discountAmount;        

        //Program display
        System.out.println("Total Bill Amount (before discount) = $" + totalBefore);
        System.out.println("Amount of discount = $" + discountAmount);
        System.out.println("Total Bill Amount (after discount) = $" + totalAfter);
	}
}
