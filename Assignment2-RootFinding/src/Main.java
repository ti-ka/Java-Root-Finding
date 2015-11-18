import java.util.Scanner;

public class Main 
{
	
	public static double[][] questions = {
			{.66666667,-5},
			{1,0,21},
			{1,5,6},
			{1,0,5,-6},
			{-2,0,16}
	};
	
	public static String[] solutionMethods = {
			"Secant",
			"False Position",
			"Bisection",
			"Newton’s Method",
			"Fixed Point Iteration"
	};
	
	public static void main(String[] args)
	{

		
		System.out.println("Assignment 2:");
		line();
		
		int questionNr = selectQuestion();
		int method = selectMethod();
		double[] question = questions[questionNr - 1];
		
		switch(method){
			case 1: 
				new Secant(question);
				break;
			case 2: 
				new FalsePosition(question);
				break;
			case 3: 
				new Bisection(question);
				break;
			case 4: 
				new Newton(question);
				break;
			case 5: 
				new FixedPointIteration(question);
				break;
			default:
				break;
		}
		
		
		
		
	}
	
	public static int selectQuestion(){


		System.out.println("Questions:");
		
		for(int i = 0; i < questions.length; i++){
			System.out.println( "\t" + (i+1) + ". " + printQuestion(questions[i]));
		}
		
		line();
		System.out.print("Enter the Question Number: ");
		
		Scanner sc = new Scanner(System.in);
		int question = sc.nextInt();
		if(question >= 1 && question <= (questions.length + 1)){
			return question;
		} else {
			System.out.println( "Umm, Question Number invalid." );
			line();
			System.out.println( "Let's try that again: ");
			return selectQuestion();
		}
		
	}

	public static int selectMethod(){


		System.out.println("Methods:");
		
		for(int i = 0; i < solutionMethods.length; i++){
			System.out.println( "\t" + (i+1) + ". " + solutionMethods[i]);
		}
		
		line();
		System.out.print("Enter the Method Number: ");
		
		Scanner sc = new Scanner(System.in);
		int question = sc.nextInt();
		//sc.close();
		if(question >= 1 && question <= (solutionMethods.length + 1)){
			return question;
		} else {
			System.out.println( "Umm, Method Number invalid." );
			line();
			System.out.println( "Let's try that again: ");
			return selectMethod();
		}
		
	}
	
	public static void line(){
		System.out.println("---------------------------------------" );
	}
	
	public static String printQuestion(double[] array){
		String string = "y = ";
		for(int i = array.length - 1; i >= 0; i--){

			double val = array[array.length - 1 - i];
			
			if(array[array.length - 1 - i] != 0){

				if(i == array.length - 1){
					if(val < 0){
						string += "-"; //Intentional: No space in first ;)
					}
				} else {
					string += (val>=0) ? " + " : " - ";	
				}
				
				
				if(i == 0){
					if (val % 1 == 0){
						string +=   (int) Math.abs(val) ; 
					} else {
						string +=    Math.abs(val) ;
					}
				} else if(i== 1){
					if (val == 1){
						string += "x"; 
					} else if(val % 1 == 0){
						string +=  (int) Math.abs(val) + "x"; 
					} else {
						string +=  Math.abs(val) + "x"; 
					}
				} else {
					if (val == 1){
						string +=  "x^" + i; 
					} else if (val % 1 == 0){
						string +=  (int) Math.abs(val) + "x^" + i; 
					} else {
						string +=  Math.abs(val) + "x^" + i; 
					}
				}	
			}
	
		}
		return string;
	}
	
	public static void print_r(double[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(i + " => " + array[i]);
		}
	}
}
