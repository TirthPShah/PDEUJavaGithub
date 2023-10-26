interface Interface1{
	
	int number = 24;
	void method1();
}

interface Interface2{
		
	void method2();
}

class Testing implements Interface1, Interface2{
	
	
	public void method1(){	
		// number = 24; Compilation Error - number is final
		System.out.println("Method1");
	}
	
	public void method2(){
		System.out.println("Method2");
	}


}

class InterfaceTest{
	
	public static void main(String[] args){
		//Interface1 i1 = new Interface1(); // Compilation Error
		Testing t = new Testing();
		t.method1();
		t.method2();
		
	}
}










