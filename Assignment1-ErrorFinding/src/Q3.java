
public class Q3 {

	public Q3()
	{

		/*
			Using C/C++ or JAVA write a looping program as shown in class. 
			Use the following fractions added together to accumulate a sum of 1.00000000.
			Print your answers and record your results.
			a.	.001
			b.	.00001
			c.	.00000001
			d.	1/1024
		*/
		
		double[] fractions = {.001,.00001,.00000001, 1.0/1024.0};
		final double SUM = 1.00000000;
		
		for(int i = 0; i < fractions.length; i++)
		{
			double fraction = fractions[i];
			int iterations = 0;
			double sum = 0;
			
			while(sum <= SUM)
			{
				sum += fraction;
				iterations++;
			}

			System.out.println("For: " + fraction);
			System.out.println("Sum: " + sum);
			System.out.println("Iterations: " + iterations);
			System.out.println("---------------------------------------");
			
			
		}
		
	}
	
	
}
