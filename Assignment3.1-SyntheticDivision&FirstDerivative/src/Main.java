import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		System.out.println("Assignment 3: [Synthetic Division/First Derivative]");
		line();
		
		SyntheticDivision sd = new SyntheticDivision();
		sd.order = getOrder();
		sd.polynomial = getPolynomial(sd.order);
		sd.divisor = getDivisor();
		sd.solve();

		sd.showSolution();
		sd.showAnswer();
		sd.showDerivatives();
		
		
	}
	

	public static int getOrder(){
		Scanner sc1 = new Scanner(System.in);

		System.out.print("Please enter the order of polynomial: ");
		int order = sc1.nextInt();
				
		//sc1.close();
		return order;
	
	}
	
	public static double[] getPolynomial(int order){
		double[] polynomial = new double[order+1];

		Scanner sc2 = new Scanner(System.in);
		for(int i = order; i >= 0; i--){
			System.out.print("Enter the coeff. of " + i + "th power: ");
			double power = sc2.nextDouble();
			polynomial[order-i] = power;
			
		}
		//sc2.close();
		return polynomial;
		
	}

	public static double getDivisor(){
		Scanner sc3 = new Scanner(System.in);

		System.out.print("Enter the divisor: ");
		double divisor = sc3.nextDouble();
				
		//sc3.close();
		return divisor;
	
	}

	public static void line(){
		System.out.println("---------------------------------------------------------------" );
	}
	public static void newLine(){
		System.out.println("");
	}
	
	public static String printAlgebra(double[] array){
		String string = "";
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
	

}
