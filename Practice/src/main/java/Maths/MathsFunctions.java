package Maths;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MathsFunctions {
	
	static Random rand = new Random();
	
	static Scanner in = new Scanner(System.in);
	
	
//---------------------------------------
//
//		    Addition
//
//---------------------------------------	

	
	public static void addition1() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(90) + 10;
			number2 = rand.nextInt(90) + 10;
			
			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
	public static void addition2() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(90) + 10;
			number2 = rand.nextInt(90) + 10;
			
			if((number1%10 + number2%10) < 10)
				continue ;
				
			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
	
	public static void addition3() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(990) + 10;
			number2 = rand.nextInt(90) + 10;
			
			if (number1 + number2 > 1000)
				continue ;

			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
	
	public static void addition4() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(990) + 10;
			number2 = rand.nextInt(990) + 10;
			
			if (number1 + number2 > 1000)
				continue ;

			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
//---------------------------------------
//
//	            Subtraction
//
//---------------------------------------	
	
	
	public static void substraction1() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(90) + 10;
			number2 = rand.nextInt(90) + 10;
			
			if (number2 >= number1)
				continue ;

			System.out.println("");
			System.out.print(number1 + " - " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 - number2 );
			
			
		}
	}
	
	
	public static void substraction2() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		int unit1 ;
		int unit2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(90) + 10;
			number2 = rand.nextInt(90) + 10;
			
			unit1 = number1 % 10 ;
			unit2 = number2 % 10 ;
			
			
			if (number1 - number2 < 10 || unit1 >= unit2 )
				continue ;

			System.out.println("");
			System.out.print(number1 + " - " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 - number2 );
			
			
		}
	}
	
	public static void substraction3() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(990) + 10;
			number2 = rand.nextInt(90) + 10;
			
			if (number1 + number2 > 1000)
				continue ;

			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
	
	public static void substraction4() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(990) + 10;
			number2 = rand.nextInt(90) + 10;
			
			if (number1 + number2 > 1000)
				continue ;

			System.out.println("");
			System.out.print(number1 + " + " + number2 );
		
			// System.out.println("Next Question: ");
			ch = in.nextLine();
			System.out.println(number1 + number2 );
			
			
		}
	}
	
	
//---------------------------------------
//
//		        Multiplication
//
//---------------------------------------	
	
	

	public static void multiply1() 
	{
		System.out.println("Which table you want to practice: ");
		int number = in.nextInt() ;
		
		String ch = "" ;
		int c ;
		
		Integer[] array = new Integer[8];
		Arrays.fill(array, 0);
		
		int min = 0 ;
				
		while(ch.equals(""))
		{

			c = rand.nextInt(8)+2;
			
			min = Collections.min(Arrays.asList(array));
			
			if (min == 1)
				Arrays.fill(array, 0);
			
			if(array[c-2] >= 1)
				continue ;
			
			array[c-2]++ ;
						
			System.out.println("");
			System.out.print( number + " x " + c );
		
			ch = in.nextLine();
			System.out.println(number * c );
			
			
		}
	}
	
	
	
	public static void multiply2() 
	{
		System.out.println("Which table to which table you want to practice: ");
		int number1 = in.nextInt() ;
		int number2 = in.nextInt() ;
		int range = number2 - number1 + 1;
		
		String ch = "" ;
		int c ;
		
		int length = range * 8 ;
		
		Integer[] array = new Integer[length];
		Arrays.fill(array, 0);
		
		int min = 0 ;
		
		int number ;
		int index ;
		int x ;
		
		while(ch.equals(""))
		{

			c = rand.nextInt(8)+2;
			number = rand.nextInt(range) + number1;
			
			min = Collections.min(Arrays.asList(array));
			
			if (min == 1)
				Arrays.fill(array, 0);
			
			x = number - number1 ; 
			index = x*8 + c - 2 ;
			
			if(array[index] >= 1)
				continue ;
			
			array[index]++ ;
						
			System.out.println("");
			System.out.print( number + " x " + c );
		
			ch = in.nextLine();
			System.out.println(number * c );
			
			
		}
	}
	
	
	public static void multiply3() 
	{
		System.out.println("Which table you want to practice: ");
		int number = in.nextInt() ;
		System.out.println("4 multiples practice from which number: ");
		int mul = in.nextInt() ;
		
		String ch = "" ;
		int c ;
		
		Integer[] array = new Integer[4];
		Arrays.fill(array, 0);
		
		int min = 0 ;
				
		while(ch.equals(""))
		{

			c = rand.nextInt(4)+ mul;
			
			min = Collections.min(Arrays.asList(array));
			
			if (min == 1)
				Arrays.fill(array, 0);
			
			if(array[c-mul] >= 1)
				continue ;
			
			array[c-mul]++ ;
						
			System.out.println("");
			System.out.print( number + " x " + c );
		
			ch = in.nextLine();
			System.out.println(number * c );
			
			
		}
	}
	
	
	
	public static void multiply4() 
	{
		String ch = "" ;
		int number1 ;
		int number2 ;
		
		while(ch.equals(""))
		{
			
			number1 = rand.nextInt(90) + 10;
			number2 = rand.nextInt(15) + 5;
			
			if(number2==10)
				continue;
			
			System.out.println("");
			System.out.print(number1 + " x " + number2 );
		
			ch = in.nextLine();
			System.out.println(number1 * number2 );
			
			
		}
	}
	
//---------------------------------------
//
//			    Division
//
//---------------------------------------
	
	
	public static void division1() 
	{
		String ch = "" ;
		int a,b,c,d ;
		
		while(ch.equals(""))
		{
			
			a = rand.nextInt(9)+1;
			b = rand.nextInt(10);
			c = rand.nextInt(9)+1;
			d = rand.nextInt(10);
			
//			if(b+d>9)
//				continue ;
			System.out.println("");
			System.out.print((a*10+b) + " + " + (c*10+d) );
		
			// System.out.println("Next Question: ");
			ch = in.nextLine();
			System.out.println((a*10+b) + (c*10+d) );
			
			
		}
	}
	
	
	
//---------------------------------------
//
//				Squares
//
//---------------------------------------
	
	
	
//---------------------------------------
//
//				Percentage
//
//---------------------------------------	
	
	
	public static void percentage1() 
	{
		System.out.println("Upto which no. you want to practice: ");
		int n = in.nextInt() ;
		
		String ch = "" ;
		int c ;
		
		Integer[] array = new Integer[n-1];
		Arrays.fill(array, 0);
		
		int min = 0 ;
		float d ;
				
		while(ch.equals(""))
		{

			c = rand.nextInt(n-1)+2;
			d = c ;
			
			min = Collections.min(Arrays.asList(array));
			
			if (min == 1)
				Arrays.fill(array, 0);
			
			if(array[c-2] >= 1)
				continue ;
			
			array[c-2]++ ;
			
				
			System.out.println("");
			System.out.print( 1 + "/" + c );
		
			ch = in.nextLine();
			System.out.println(1/d * 100);
			
			
		}
	}
	
	
	public static void percentage2() 
	{
		System.out.println("Upto which no. you want to practice: ");
		int n = in.nextInt() ;
		
		String ch = "" ;
		int c ;
		int b ;
		
		Integer[] array = new Integer[n-1];
		Arrays.fill(array, 0);
		
		int min = 0 ;
		float d ;
		float a ;
				
		while(ch.equals(""))
		{
			
			b = rand.nextInt(n-1)+1;
			c = rand.nextInt(n-1)+2;
			d = c ;
			a = b ;
			
			min = Collections.min(Arrays.asList(array));
			
			if (min == 1)
				Arrays.fill(array, 0);
			
//			if(array[c-2] >= 1)
//				continue ;
			
			array[c-2]++ ;
			
			if(b >= c)
				continue ;
				
			System.out.println("");
			System.out.print( b + "/" + c );
		
			ch = in.nextLine();
			System.out.println(a/d * 100);
			
			
		}
	}


}
