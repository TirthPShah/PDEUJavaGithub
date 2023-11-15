/*Thread Properties printing....*/

class ThreadTest1{
	
	public static void main(String[] args){
	
		System.out.println("ThreadingTest Example!!!!");
		
		System.out.println("Id : " + Thread.currentThread().getId());
		System.out.println("Name : " + Thread.currentThread().getName());
		System.out.println("Priority Value(0 to 10) : " + Thread.currentThread().getPriority());
		System.out.println("status Alive? : " + Thread.currentThread().isAlive());
		System.out.println("BackGround Thread ? : " + Thread.currentThread().isDaemon());
	}
}