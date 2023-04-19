package cab_booking;
import java.util.Scanner;

public class PaymentMode {
	Scanner sc = new Scanner(System.in);
	
 String mode = sc.next();
 
	
	public PaymentMode()
	{
		System.out.println("Chose your payment mode");
		switch(mode)
		{
		case "UPI":
			
			System.out.println("Redirecting....");
			
		 case "Card":
				
				System.out.println("Redirecting....");
				
		 case "Cash":
			 System.out.println("Payment accepted");
		}
		
	    
	}
		
	}
	


