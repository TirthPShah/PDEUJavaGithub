// Hierarchical Inheritance
class A{
	int number1;
	public A(){
		System.out.println("Default Constructor A");
	}

	public void printing(){
		System.out.println("A is printing!!!");
	}
}

class B extends A{
	
	public B(){
		//super();
		System.out.println("Default Constructor B");
	}
	
	// Method Overriding
	public void printing(){
		System.out.println("B is printing!!!");
	}
}

class C extends A{
	
	public C(){
		// super();
		System.out.println("Default Constructor C");
	}

	// Method Overriding
	public void printing(){
		System.out.println("C is printing!!!");
	}
}

class MultiLevelInheritance{
	
	// Runtime Polymorphism - dynamic method dispatch - dynamic binding
	public static void main(String[] args){
		A c1 = new C(); // Upcasting (Converting subClass to superClass)
		A b1 = new B();
		c1.printing();
		b1.printing();
	}
}









