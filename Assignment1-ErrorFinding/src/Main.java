import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		/* This is a basic mapping of questions in this assignment */
		
		System.out.print("Assignment 1:"
				+ "\n-------------"
				+ "\nEnter the Question Number: ");
		
		
		Scanner sc = new Scanner(System.in);
		int question = sc.nextInt();

		System.out.println("Loading question #" + question + " ...");
		System.out.println("---------------------------------------");
		switch(question)
		{
		case 1:
			new Q1();
			break;
		case 2:
			new Q2();
			break;
		case 3:
			new Q3();
			break;
		default: 
			System.out.println("Invalid Question number: RANGE 1-3");
			break;
		}
		sc.close();
		
	}
	
}
