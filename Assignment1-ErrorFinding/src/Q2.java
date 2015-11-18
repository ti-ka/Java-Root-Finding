
public class Q2 {

	public Q2()
	{
		/*
			Use some of the online compilers or compilers you have to test the simple program given in class.
		 	Test it in at least the following languages, recording your answers:
			a.	FORTRAN
			b.	BASIC
			c.	C/C++
			d.	JAVA				 
		 */
		
		System.out.println("Java Version:");
		System.out.println("---------------------------------------");
		
		
		double one = 1.0;
		double two = 2.0;
		double three = 3.0;
		double five = 5.0;
		
		double h = (one/two);
		double x = ((two/three) - h);
		double y = ((three/five) - h);
		
		double e = (x+x+x) - h;
		double f = (y+y+y+y+y) - h;
		double q = (2.0*(f/e));
		
		System.out.println("q is " + q);
		
		
		
		/* Using Python v3 : 
		________________________________________________
			__author__ = 'Tika'
	 
			one = 1.0
			two = 2.0
			three = 3.0
			five = 5.0
			 
			h = (one/two)
			x = ((two/three) - h)
			y = ((three/five) - h)
			 
			e = ((x+x+x) - h)
			f = ((y+y+y+y+y) - h)
			q = (2.0*(f/e))
			 
			print ("q is ", q)
		
		 * */
		
		/* Using FORTRAN
		
			program ASSIGNMENT
				double precision one = 1.0
				double precision two = 2.0
				double precision three = 3.0
				double precision five = 5.0
				
				double precision h = (one/two)
				double precision x = ((two/three) - h)
				double precision y = ((three/five) - h)
				
				double precision e = (x+x+x) - h
				double precision f = (y+y+y+y+y) - h
				double precision q = (2.0*(f/e))
				
				WRITE (*,*) 'q is ',q
				stop
			end
		
		
		   
		 *  */
		
	}
	
}
