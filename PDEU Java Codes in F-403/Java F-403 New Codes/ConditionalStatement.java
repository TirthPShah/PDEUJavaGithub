class ConditionalStatement1{
	
	public static void main(String[] args){

		int number1 = 15;
		int number2 = 20;

		if(number1 > number2)
			System.out.println(number1 - number2);
		else
			System.out.println(number2 - number1);

		//Ternary ?: operator usage in java
		
		int subtraction = (number1 > number2) ? number1 - number2 : number2 - number1;
		
		
		System.out.println(subtraction);
		/*
		
		int number = 25; 
		
		if(number == 25) {	
			// number <, >, <=, >=, ==, !=
			System.out.println("Positive Value");
			System.out.println(number);
		}
		else
			System.out.println("Negative value");
		*/
	}
}