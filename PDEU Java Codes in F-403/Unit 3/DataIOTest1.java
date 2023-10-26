/*DataInputStream for reading primitive types from the file
wap to read primitive typesfrom the file "DataIO.txt"*/

import java.io.*;

class DataIOTest1{
	
	public static void main(String[] args) throws Exception{
		
		DataInputStream din = null;
		//int id = 25;
		//String name = "Emp1";
		try{
			// FileInputStream fs = new FileInputStream("DataIO.txt");
			// do = new DataInputStream(fs);
			din = new DataInputStream(new FileInputStream("DataIO.txt"));
			System.out.println("ID : " + din.readInt());
			System.out.println("Name : " +  din.readUTF());
			
			System.out.println("reading Complete!!!");
		}catch(IOException e){
			System.out.println("File Handling Error!!!");
		}finally{
			din.close();
		}
	}
}