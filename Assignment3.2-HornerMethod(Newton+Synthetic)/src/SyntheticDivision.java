
public class SyntheticDivision {

	public int order;
	public double[] polynomial;
	public double divisor;

	public double[] answers;
	public double[] products; //Just to preserve diagram. Not Necessary!

	public void solve(){
		answers = new double[order+1]; //0th will have remainder
		products = new double[order+1];
		
		double remainder = 0;

		
		for(int i = 0; i <= order; i++){
			double product = remainder * divisor;
			double sum = polynomial[i] + product;
			
			products[i] = product;
			answers[i] = sum;
			remainder = sum;
		}
		
		
		//Finally Putting quotient & remainder for cleanliness

		
	}

	public void showAnswer(){

		System.out.print("Quotient: \t");
		System.out.print(Main.printAlgebra(getQuotient()));
		
		System.out.print("\nRemainder: \t" );
		if(getRemainder() % 1 == 0){
			System.out.print((int) getRemainder());
		} else {
			System.out.print(getRemainder());
		}
	}
	
	public void showSolution(){
		

		Main.line();
		System.out.println("Solution:\n");

		
		//Divisor
		if(divisor % 1 == 0){
			System.out.print((int) divisor);	
		} else {
			System.out.print(divisor);
		}

		System.out.print("\t|");
		
		//Polynomial
		
		for(int i = 0; i <= order; i++){
			System.out.print("\t");
			if(polynomial[i] % 1 == 0){
				System.out.print((int)polynomial[i]);	
			} else {
				System.out.print(polynomial[i]);
			}
		}

		System.out.print("\n");
		
		
		
		//Products
		System.out.print("\t|");
		
		
		for(int i = 0; i <= order; i++){
			System.out.print("\t");
			if(products[i] % 1 == 0){
				System.out.print((int)products[i]);	
			} else {
				System.out.print(products[i]);
			}
		}

		System.out.print("\n");

		
		System.out.print("      \t ------------------------------------------------------");
		System.out.print("\n");
		

		//Answers
		System.out.print("\t ");
		
		
		for(int i = 0; i <= order; i++){
			System.out.print("\t");
			if(answers[i] % 1 == 0){
				System.out.print((int)answers[i]);	
			} else {
				System.out.print(answers[i]);
			}
		}

		System.out.print("\n");

		Main.line();
		System.out.print("\n");
		

	}
	
	public void showDerivatives(){
		Main.newLine();
		Main.line();
		System.out.println("Doing the division once again:");
		
		double fx = getRemainder();
		double fprimex = firstDerivative();

		Main.newLine();
		Main.line();
		System.out.println("Functional values & Derivatives at x=" + this.divisor);
		Main.line();
		System.out.println("f(" + this.divisor + ") =\t" + fx);
		System.out.println("f'(" + this.divisor + ") =\t" + fprimex);
		Main.line();
		
	}
	
	public double firstDerivative(){
		SyntheticDivision sd1 = new SyntheticDivision();
		sd1.order = this.order - 1;
		sd1.polynomial = this.getQuotient();
		sd1.divisor = this.divisor;
		sd1.solve();

		//sd1.showSolution();
		//sd1.showAnswer();
		//sd1.showDerivatives();
		
		double fprimex = sd1.getRemainder();
		return fprimex;
	}

	public double[] getQuotient(){
		double[] quotient = new double[order];
		for(int i = 0; i < answers.length - 1; i++){
			quotient[i] = answers[i];	
		}
		return quotient;
		
	}
	
	public double getRemainder(){
	
		return answers[answers.length-1];
	
	}
}
