/*File Handling in java - java.io

Streams - Byte Oriented Stream (Input/Output Stream) - FileInputStream/FileOutputStream
           Character Oriented Stream (Input/Output Stream)
1.Read file naming "file1.java" and copy the content of the file to "File2.java"
*/

import java.io.*;

class FileTest2{

	public static void main(String[] args) throws Exception{
		
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		try{
			 fs = new FileInputStream("File1.java");
			 fo = new FileOutputStream("File2.java");
			
			 int key = 8;	
			 while(fs.available() > 0){
				// Code encryption with +key value
				fo.write(fs.read() + key);
				// Code Decryption with - key value
				//fo.write(fs.read() - key);
			 }
			 System.out.println("Reading Complete");
			
		}catch(IOException e){
			System.out.println("File not available for reading or writing!!!");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			fs.close();
			fo.close();
		}
	}
		
}











