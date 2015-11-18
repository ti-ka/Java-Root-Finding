import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HornerMethod hd = new HornerMethod(getPolynomial());
		
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
	
	public static int getOrder(){
		Scanner sc1 = new Scanner(System.in);

		System.out.print("Please enter the order of polynomial: ");
		int order = sc1.nextInt();
				
		//sc1.close();
		return order;
	
	}
	
	public static double[] getPolynomial(){
		int order = getOrder();
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
