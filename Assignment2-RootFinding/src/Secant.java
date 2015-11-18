import java.util.Scanner;

public class Secant {
	
	private double[] question;
	private double solution;
	
	//MAXIMUM
	public double tolerance;
	public double maxIterations;
	
	//During the loop ... 
	public double currentTolerance;
	public double iterations;
	

	public Secant(double[] question){
		this.question = question;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of x0: ");
		double x0 = sc.nextDouble();

		System.out.print("Enter the value of x1: ");
		double x1 = sc.nextDouble();

		System.out.print("Enter the value of tolerance: ");
		this.tolerance = sc.nextDouble();
		
		System.out.print("Enter the max number of iterations: ");
		this.maxIterations = sc.nextDouble();
		
		sc.close();
		
		this.solve(x0,x1);
		this.showResult();
	}
	
	public void solve(double x0, double x1){
		
		double x;
		
		if(x0 == x1){
			Main.line();
			System.out.println("x1 and x2 cannot be same - ERROR!!!");
			return;
		}
		
		do{
			iterations++;
			
			x = x0 - f(x0) * (  (x1-x0)/(f(x1) - f(x0)) );
			
			currentTolerance = Math.abs(x - x1);
			
			x0 = x1;
			x1 = x;
			
		} while ( currentTolerance > tolerance
			&& iterations < maxIterations);
		

		solution = x;
		
		
	}
	
	public void showResult(){
		Main.line();
		if(currentTolerance > tolerance){
			System.out.println("Result: TOLERANCE NOT MET");
			Main.line();
			System.out.println("Solution:\t" + solution);
			System.out.println("Iterations:\t" + iterations);
			System.out.println("Tolerace:\t" + currentTolerance);	
		} else {
			System.out.println("Result:");
			Main.line();
			System.out.println("Solution:\t" + solution);
			System.out.println("Iterations:\t" + iterations);
			System.out.println("Tolerace:\t" + currentTolerance);
		}
		
		Main.line();
	}
	
	public double f(double x){
		double sum = 0;
		
		for (int i = 0; i < this.question.length; i++){

			double multiplier = question[i];
			int power = (question.length - 1) - i;
		
			sum += multiplier * Math.pow(x, power);
			
		}
		return sum;
	}

	
}
