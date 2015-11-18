import java.util.Scanner;

public class Q1 {

	public Q1()
	{

		/*
		
		 Assignment:
		 
		 1.	Write a program that will find the value of e^x to within 0.00001.  Your program should:
			a.	Ask the user for the value of x.  x should be able to be positive or negative.
			b.	Hints – you can try it in a program like excel first if you want.
			c.	Your program should use a loop with a condition in it comparing the current value to the previous value.  If the difference between those two numbers is = to or less than 0.00001, stop the loop.  
			d. 	Make sure and record how many iterations it takes.

		 */

		
		while(true) //This is just to run the program infinitely...
		{

			//Get user input to get the value of e^x:
			System.out.print("Enter the value for x: ");
			int x = getUserInput();
			if(x >= 0)
			{
				System.out.println("Value of e^" + x  + " is: " + getEx(x));	
			} else {
				System.out.println("x should be zero or positive");
			}
			System.out.print("---------------------------------------\n");
			
		}
		
		
	}
	
	public double getEx(int x){
		
		double n = 0;
		double value = 0;
		final double RANGE = 0.00001;

		double current = Math.pow(x, n) / factorial(n);
		double next = Math.pow(x, (n+1)) / factorial(n+1);

		
		int iterations = 0;
		//while(Math.abs(current - next) < RANGE)
		while(current > RANGE)
		{
			value = value + current;
			
			n++;
			
			//New values of current and next
			current = Math.pow(x, n) / factorial(n);
			next = Math.pow(x, (n+1)) / factorial(n+1);


			//System.out.println(current + " for " + n);
			//System.out.println(next + " for " + n);
			iterations++;
			
		}

		System.out.println("Iterations: " + iterations);
	
		return value;	
		
	}
	
	public int getUserInput()
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		return r;
	}
	
	public double factorial(double number)
	{
		double product = 1;
		while(number >= 1)
		{
			product = product * number;
			number--;
		}
		return product;
	}
	
	
}
