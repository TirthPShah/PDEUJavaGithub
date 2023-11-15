class Employee{
	
	int id;
	String name;
	
	Employee(int id, String s){
		this.id = id;
		name = s;
	}

}

class SalesPerson extends Employee{}

class ObjecrClassTest{
	
	public static void main(String[] args){
		/*
		Class c1 = SalesPerson.class;

		System.out.println(c1.getName());
		
		Class sc = c1.getSuperclass();
		
		System.out.println(sc.getName());
		*/

		Class c1 = Employee.class;

		System.out.println(c1.getName());
		
		Class sc = c1.getSuperclass();
		
		System.out.println(sc.getName());
	}
	
}








