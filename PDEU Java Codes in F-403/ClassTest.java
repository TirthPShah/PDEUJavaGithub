/*class
Objects/instances
constructors
instance variable
static variable
instance methods/member method
static  methods/class methods
this, new keywords
initializer block
Product - pId, pName, price 	
*/
class BankAccount{

	/*various fields*/

	private int aId;
	private double balance;
	private String accHolderName;
	static int count;
	
	static{
		System.out.println("Static initializer block");
	}

	// Initializer Block
	
	{
		System.out.println("Initializer Block");
		count++;
		aId = 1000 + count;
	}

	// setter method for name

	public void setName(String name){
		accHolderName = name;
	}
	
	// Getter method for name
	public String getName(){
		return accHolderName;
	}
	// Default Constructor
	BankAccount(){
		
		this(0, "NA");
		/*
		balance = 0;
		holderName = "NA";
		count++;
		*/
	}
	// Overloaded parameterized constructor
	BankAccount(double balance, String holderName){
		this.balance = balance;
		this.accHolderName= holderName;
		//count++;
	}
	// instance method
	void printBankAccount(){
		System.out.println("Id : " + aId + " \t Balance : " + balance + " \t Name : " + accHolderName);
	}	

	// static method
	
	static int countBankAccounts(){
		return count;// balance
	}
}//

class ClassTest{
	
	public void getTotalBalance(BankAccount[] accounts){
		//for(int i = 0; i < accounts.)
	}

	public static void main(String[] args){
	
		BankAccount ba1 = new BankAccount(5000, "User1");
		BankAccount ba2 = new BankAccount(6000, "User2");
		BankAccount ba3 = new BankAccount();

		BankAccount accounts[] = {ba1, ba2, ba3, new BankAccount(7000, "User3")};
		
		ba1.printBankAccount();
		ba1.setName("User"); 
		ba1.printBankAccount();
		ba2.printBankAccount();
		ba3.printBankAccount();
		
		//System.out.println(ba1.aId + "\t" + ba1.balance);
		
		System.out.println(BankAccount.countBankAccounts());
		
	}
}

























