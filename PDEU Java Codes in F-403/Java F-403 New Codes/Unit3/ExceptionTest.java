class ExceptionTest{
	
	public static void main(String[] args){
		
		System.out.println("START");
		int number1 = 25;
		int number2 = 0;
		String name = null;

		try{
			//int div = number1 / number2;
			name.toUpperCase();
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		
		System.out.println("END");
	}
}