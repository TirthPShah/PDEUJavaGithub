// Inheritance basics, creation of superclass and subclass, calling constructors of subclass
 
//Create Employee class having two fields id,salary 
// usage of super keyword, method overriding, dynamic binding, polymorphisam
//derive SalesManager class from Employee and add one field as a totalSalesAmount 
//Super Class - Base Class -  Parent Class

class SuperClass{
	
	protected int number1; // protected member can be accessible to subclass
	
	public SuperClass(){
		number1 = 10;
		//System.out.println("SuperClass Default Constructor");
	}
	
	public SuperClass(int n1){
		number1 = n1;
		//System.out.println("Superclass int constructor");
	}

	public void printData(){
		System.out.println("SuperClass PrintData -  : " + number1);
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
		//System.out.println("Sub-Class Default Constructor");
	}
	
	public SubClass(int n1, int n2){
		//super(n1); // super to call base class constructor
		number1 = n1;
		number2 = n2;
		//System.out.println("Sub-Class int, int Constructor");
	}

	public void printData(){
		//super.printData(); // super to call base class method
		System.out.println("SubClass PrintData -  : "  + number2);
	}
}

class InheritanceTest1{
	
	public static void main(String[] args){
		
		//SuperClass sc = new SuperClass();
		//SubClass sb = new SubClass();

		SuperClass sc = new SubClass();
		// SubClass sb1 = new SubClass(10, 20);
		//sb1.printData();
		sc.printData();
	}
}










