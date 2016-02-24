import java.security.SecureRandom;

public class MethodsAndArrays {

	public static void main(String[] args) {
		
		System.out.println(rollDice(3, 6));	

	}
		
	//Method returns an int = result;
	public static int rollDice(int numDice, int numSides ){
		//Random Numbers
		SecureRandom generateRandom = new SecureRandom();
		
		int result = 0;
		//Array of integers
		int[] Dice = new int [numDice];
		
		//ForLoop
		for(int index=0; index < numDice-1; index++){
			result += generateRandom.nextInt(6) +1;;
		}
	
		return result;
	}

}
