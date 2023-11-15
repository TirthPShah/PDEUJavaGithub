/*WAP to create a child thread which prints greeting message...*/


class ChildThread1 extends Thread{
	
	/* Task to be executed by Thread...Override run method of Thread class*/	
	public void run(){
		for(int i = 1; i <= 50; i++){
			System.out.println("Welcome from : " + Thread.currentThread().getName() + " "+ i);
		}
	}
}



class ThreadTest2{
	
	public static void main(String[] args){
	
		System.out.println("ThreadingTest Example!!!!");
		
		ChildThread1 thread1 = new ChildThread1(); 
		
		thread1.setName("ChildThread1");
		thread1.start(); // state changes from new to runnable

		for(int i = 51; i <= 100; i++){
			System.out.println("Greetings from : " + Thread.currentThread().getName() + " "  + i);
		
		
		
	}
	System.out.println("********** GOODBYE ********************************");
	}
}












