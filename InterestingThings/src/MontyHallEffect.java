
public class MontyHallEffect {

	public static String[] options = {"WIN", "LOSE", "LOSE"};
	public static int firstChoice;
	public static int secondChoice;
	public static boolean flip = false;
	public static int trials = 10000;
	
	public static void start() 
	{
		System.out.println("====================================");
		System.out.println("Monty Hall Effect:");
		System.out.println("====================================");
		
		
		System.out.println("Without Flipping:");
			roll();
		System.out.println("------------------------------------");
			flip = true;
		System.out.println("After Flipping:");
			roll();
		System.out.println("====================================");
		
	}

	public static void resetOptions(){
		options[0] = "WIN";
		options[1] = "LOSE";
		options[2] = "LOSE";
		
	}

	public static void roll(){
		int correct = 0;
		int incorrect = 0;
		for(int i = 0; i < trials; i++){
			
			resetOptions();
			
			firstChoice = (int) (Math.random() * 3);
			openADoor();
			
			if(flip){
				flipChoice();
			} else {
				secondChoice = firstChoice;
			}
			if(options[secondChoice].equals("WIN")){
				correct++;
			} else {
				incorrect++;
			}
			
		}
		float percent = ((float) correct)/trials*100;
		System.out.println(correct + " WINS " + incorrect + " FAILS (" + percent + "%)" );
		
	}
	
	public static void openADoor()
	{
		//Start at 0,1,or 2
		int index = (int) (Math.random() * 3);
		while(true){
			if(options[index].equals("LOSE") && index != firstChoice){
				options[index] = "OPEN";
				break;
			} else {
				index++;
				if(index >= options.length){
					index = 0;	
				}

			}
			
		}
		
	}
	
	public static void print(String[] obj){
		for(int i = 0; i < obj.length; i++){
			System.out.print(obj[i] + "\t");
		}
		System.out.print("\n");
	}
	
	public static void flipChoice(){
		for(int i = 0; i < options.length; i++){
			if(i != firstChoice && !(options[i].equals("OPEN"))){
				secondChoice = i;
			}
		}
	}

}
