import java.util.*;

class ArrayExample{
	
	
	static void printArray(int[] numbers){
		for(int values : numbers)
			System.out.println("Value : " + values);
	}
		
	static float averageOfArrayValues(int[] number){
		
		return 1.0f;
	}
	
	static boolean isPrime(int number){
		
		return true;
		
	}

	public static void main(String[] args){
		
		Scanner scan  = new Scanner(System.in);
		int numbers[] = new int[5]; 
		
		numbers[5] = 60;
		int[] numbers1 = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = scan.nextInt();
		printArray(numbers);
		
	}
}