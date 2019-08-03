package Maths;

import java.util.Scanner;
import Maths.MathsFunctions ;

public class Maths {
	
	static Scanner in = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		System.out.println("Enter Operation: ");
		System.out.println("1. Addition: ");
		System.out.println("2. Substraction: ");
		System.out.println("3. Multiplication: ");
		System.out.println("4. Division: ");
		System.out.println("5. Squares: ");
		System.out.println("6. Percentage: ");
		int choice = in.nextInt() ;
		
		int diff = 0 ;
			
		switch(choice)
		{
			case 1 : System.out.println("Enter difficulty: ");
					 System.out.println("1. All kind of 2 digits ");
					 System.out.println("2. Hard 2 digits ");
					 System.out.println("3. 3 digit and 2 digit");
					 System.out.println("4. All kind 3 digit ");
					 diff = in.nextInt() ;
				
					switch(diff)  {
			
					case 1 : MathsFunctions.addition1();
						break ;
					case 2 : MathsFunctions.addition2();
						break ;
					case 3 : MathsFunctions.addition3();
						break ;
					case 4 : MathsFunctions.addition4();
						break ;
					}
					
			case 2 : System.out.println("Enter difficulty: ");
					 System.out.println("1. All kind of 2 digits ");
					 System.out.println("2. Hard 2 digits ");
					 System.out.println("3. 3 digit minus 2 digits");
					 System.out.println("4. All kind of 3 digits");
					 
			 		 diff = in.nextInt() ;
		
			 		switch(diff)  {
	
			 		case 1 : MathsFunctions.substraction1();
			 			break ;
			 		case 2 : MathsFunctions.substraction2();
			 			break ;
			 		case 3 : MathsFunctions.substraction3();
			 			break ;
			 		case 4 : MathsFunctions.substraction4();
			 			break ;
			 		}
			
			case 3 : System.out.println("Enter difficulty: ");
					 System.out.println("1. Whatever table : ");
					 System.out.println("2. Range of table : ");
					 System.out.println("3. Table with specific multiples : ");
					 System.out.println("4. 2 Digit multiplication(till 20): ");
			 		 diff = in.nextInt() ;
		
			 		switch(diff)  {
	
			 		case 1 : MathsFunctions.multiply1();
		 				break ;
			 		case 2 : MathsFunctions.multiply2();
	 					break ;
			 		case 3 : MathsFunctions.multiply3();
 						break ;
			 		case 4 : MathsFunctions.multiply4();
						break ;
			 		}
 						
			 		
			 case 6 : System.out.println("Enter difficulty: ");
					  System.out.println("1. Fraction to percent(1st value)");
					  System.out.println("2. Fraction to percent(any value)");
					  System.out.println("3. Percentage to fraction");
			 		  diff = in.nextInt() ;
		
			 		switch(diff)  {
	
			 		case 1 : MathsFunctions.percentage1();
		 				break ;
			 		case 2 : MathsFunctions.percentage2();
	 					break ;
			 		case 3 : MathsFunctions.multiply3();
						break ;
			 		}

		
		
	}

	}
}








