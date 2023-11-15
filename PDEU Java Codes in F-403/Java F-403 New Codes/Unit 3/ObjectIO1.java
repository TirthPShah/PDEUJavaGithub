/*read student Object details into from "StudentData.txt"*/

import java.io.*;
/*Serializable is a markup(empty) interface*/
class Student implements Serializable{
		
	String name;
	int percentage;
	public Student(int p, String n){
		name = n;
		percentage = p;
	}
	
	public String toString(){
		return "Name : " + name + " percentage : " + percentage;
	}
}

class ObjectIOTest1{
		
		public static void main(String[] args) throws Exception{
			
			ObjectInputStream os = null;
			Student s1 = new Student(90, "Student1");
			try{
			os = new ObjectInputStream(new FileInputStream("StudentData1.txt"));
				System.out.println(os.readObject());
			
			}catch(Exception e){
				System.out.println(e);
			}finally{
				try{
					os.close();
				}catch(Exception e){}
			}
		}
}