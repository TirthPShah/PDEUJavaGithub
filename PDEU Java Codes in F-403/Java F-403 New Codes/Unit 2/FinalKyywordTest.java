// class can not be extended if class marked with final
final class A{
	
	final int number = 10;

	public A(){
	}

	// if method marked with final it can not be override by derived class
	final public void printing(){
		System.out.println("A is printing!");
	}
	
}
// Class B can not extends from final class A
class B extends A{
	
	public B(){}
	
	public void printing(){
		System.out.println("B is printing!");
	}
}

class FinalKeyWordTest{
	
	public static void main(String[] args){
	}
}