// Super Class - Base Class -  Parent Class

class SuperClass{
	
	int number1;
	
	public SuperClass(){
		number1 = 10;
		System.out.println("SuperClass Default Constructor");
	}
	
	public SuperClass(int n1){
		System.out.println("Superclass int constructor");
	}
	
}

// Sub class - derived class - child class can reuse fields and methods of SuperClass
class SubClass extends SuperClass{

	// Subclass can have their own instance fields apart from SuperClass fields.
	int number2;

	// Subclass Default Constructor
	
	public SubClass(){
		// compiler tries to call superclass default constructor with super()
		number1 = 20;
		number2 = 30;
		System.out.println("Sub-Class Default Constructor");
	}
	
	public SubClass(int n1, int n2){
		super(n1);
		//number1 = n1;
		number2 = n2;
		System.out.println("Sub-Class int, int Constructor");
	}
}

class InheritanceTest{
	
	public static void main(String[] args){
		
		//SuperClass sc = new SuperClass();//
		//SubClass sb = new SubClass();

		SubClass sb1 = new SubClass(10, 20);
	}
}










