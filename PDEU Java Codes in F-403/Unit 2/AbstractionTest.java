
abstract class Shape{
	
	public  abstract void draw();
	abstract long calculateArea();
	
}


// interface by default all methods are abstract and public
interface Resizeable{
	void resize(int resizeFactor);
}


//Multiple inheritance with interface implementation
class Square extends Shape implements Resizeable{
	
	public void draw(){ System.out.println("Square Drawing");}
	long calculateArea(){return 0;}
	public void resize(int rf) {System.out.println("Resizing!!!");}
		
	public String toString(){
		return "Square Shape";
	}
	
}

class Circle extends Shape{
	
	public void draw(){ System.out.println("Circle Drawing");}
	long calculateArea(){return 0;}	
}


class AbstractionTest{
	
	public static void ResizableShapes(Shape[] sp){
		System.out.println("Resizeble shapes are : ");
		for(int i = 0; i < sp.length; i++){
			if(sp[i] instanceof Resizeable){
				System.out.println(sp[i]);
			}
		}
	}
	public static void main(String[] args){
		
		Shape s1 = new Square();
		s1.draw();
	
		Shape[] shapes = {new Square(), new Circle(), new Square(), new Circle()};
		ResizableShapes(shapes);
	}
}












