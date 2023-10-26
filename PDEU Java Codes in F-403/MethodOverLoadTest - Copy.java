class MethodOverLoadTest{
	
	static int add(int n1, int n2){
		return n1 + n2;
	}

	static long add(int n1, long l2){return n1 + n2;}
	static double add(double  n1, double n2){
		return n1 + n2;
	}
	
	
	public static void main(String[] args){
		
		int n1 = 25;
		int n2 = 20;
		
		double d1 = 23.4;
		double d2 = 24.4;

		int sum = add(n1, n2);
		double dSum = add(d1, d2);
	}
}