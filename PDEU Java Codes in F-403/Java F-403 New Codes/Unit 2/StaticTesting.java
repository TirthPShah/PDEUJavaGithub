class A{
	
	static int number1 = 10;
	
	public static void printing(){
		System.out.println("A :" + number1);
	}
}

class B extends A{
	
	static int number1 = 20;
	
	public static void printing(){
		System.out.println("B :" + number1);
	}
}

class C extends A{
	
	static int number1 = 30;
	
	public static void printing(){
		System.out.println("C :" + number1);
	}
}

class StaticTesting{

	public static void main(String[] arg){
		
		A a1 = new B();
		B b1 = new B();
		a1.printing(); // A-
		b1.printing(); // A-
		
	}
}












