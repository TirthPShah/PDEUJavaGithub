/*Store student Object details into file "StudentData.txt"*/

import java.io.*;

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
/*WAP to store Employee Object(id, name) to file Employee.txt*/
class ObjectIOTest{
		
		public static void main(String[] args) throws Exception{
			
			ObjectOutputStream os = null;
			Student s1 = new Student(90, "Student1");
			try{
			os = new ObjectOutputStream(new FileOutputStream("StudentData1.txt"));
			os.writeObject(s1);
			
			}catch(Exception e){
				System.out.println(e);
				e.printStackTrace();
			}finally{
				try{
					os.close();
				}catch(Exception e){}
			}
		}
}