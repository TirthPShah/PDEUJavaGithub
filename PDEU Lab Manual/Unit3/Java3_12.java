class InvalidBoxException extends RuntimeException {}

class Box {

    public float length, width, height;

    public Box(float length, float width, float height) {

        if(length <= 0 || width <= 0 || height <= 0) {
            throw new InvalidBoxException();
        }

        this.length = length;
        this.width = width;
        this.height = height;

        System.out.println("- - - - Box created successfully. - - - -");
    }
}

public class Java3_12 {

    public static void main(String[] args) {
        
        Box validBox = new Box(1, 2, 3);

        try {
            Box invalidBox = new Box(0, 1, 2);
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }   
}