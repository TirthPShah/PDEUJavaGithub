class A{
	
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

class C extends B{
	
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
	
	public static void main(String[] args){
		C c1 = new C();
		c1.printing();
	}
}









