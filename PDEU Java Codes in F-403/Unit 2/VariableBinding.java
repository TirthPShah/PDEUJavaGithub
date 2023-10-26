class A{
	
	int number1 = 10;
	
	public void printing(){
		System.out.println("A is printing : " + number1);
	}
}

class B extends A{
	
	int number1 = 20;
	
	public void printing(){
		System.out.println("B is printing : " + number1);
	}
}

class C extends A{
	
	int number1 = 30;
	
	public void printing(){
		System.out.println("C is printing : " + number1);
	}
}

class VariableBinding{

	public static void main(String[] args){
		
		A a1 = new B();
		A b1 = new C();
	
		// Runtime method binding - 
		a1.printing();
		b1.printing();
		
		// Variable binding
		System.out.println(a1.number1 + "\t" + b1.number1);
	}

}














