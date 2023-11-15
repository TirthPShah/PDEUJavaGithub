class Employee{
	
	int id;
	String name;
	
	Employee(int id, String s){
		this.id = id;
		name = s;
	}
	
	// Override equals(Object o) method from java.lang.Object class
	
	public boolean equals(Object other){
		Employee emp = (Employee) other;

		return ((this.id == emp.id) && (name.equals(emp.name)));
	}
	//Override toString() method from java.lang.Object class
	public String toString(){
		return "Id : " + id + " and  name : " + name;
	}

}

class ObjecrClassTest1{
	
	public static void main(String[] args){
		
		Employee e1 = new Employee(101, "Emp1");
		Employee e2 = new Employee(101, "Emp1");
		System.out.println(e1);
		//System.out.println(e1 == e2);
		System.out.println("Emp1 and Emp2 are equal : " + e1.equals(e2));
	}
	
}

















