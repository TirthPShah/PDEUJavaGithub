class LoopingExample{
	
	public static void main(String[] args){
		System.out.println(" : Multiplication Table :");
		/*
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}*/

		int i = 0;
		while(true){
			i++;
			if(i == 6) continue;
			System.out.println("5 x" + i + " is : " + 5 * i);
			if(i == 10) break; 
		}

		int j = 1;
		do{
			System.out.println(j++);
			if(j == 10) break;
		}while(false);
		
	}
}
















