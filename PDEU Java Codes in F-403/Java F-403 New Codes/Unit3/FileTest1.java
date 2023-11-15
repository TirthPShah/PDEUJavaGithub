/*File Handling in java - java.io

Streams - Byte Oriented Stream (Input/Output Stream) - FileInputStream/FileOutputStream
           Character Oriented Stream (Input/Output Stream)
1.Read file naming "file1.java" and print it's contents to console.
*/

import java.io.*;

class FileTest1{

	public static void main(String[] args) throws Exception{
		
		//File f = new File("File1.java");
		FileInputStream fs = null;
		
		try{
			 fs = new FileInputStream("File1.java");
				
			 while(fs.available() > 0){
				System.out.print((char)fs.read());
			 }
			 System.out.println("Reading Complete");
			
		}catch(IOException e){
			System.out.println("File not available for reading!!!");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			fs.close();
		}
	}
		
}











