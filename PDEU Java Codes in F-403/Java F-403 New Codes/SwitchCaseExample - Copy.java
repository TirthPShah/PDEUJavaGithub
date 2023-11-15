class SwitchCaseExample{
	
	public static void main(String[] args){
		
		int number = Integer.parseInt(args[0]);
		// float num = 1.0f;
		switch(number){
			
			case 1 :System.out.println("ONE"); 
				break;
			case 2 :System.out.println("TWO"); 
				break;
			case 3 :System.out.println("THREE"); 
				break;
			case 4 :System.out.println("FOUR"); 
				break;
			default:
				System.out.println("Invalid!!!");
		}
	}
}