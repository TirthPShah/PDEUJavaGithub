class Printer {

    public void printOdd(int i) {
        System.out.println("Odd: " + i);
    }

    public void printEven(int i) {
        System.out.println("Even: " + i);
    }

}

class PrintEven extends Thread {
    
    Printer p;
    int num;

    public PrintEven (Printer p, int num) {
        this.p = p;
        this.num = num;
    }

    public void run() {

        for(int i = 2; i <= num; i = i + 2) {
            
            p.printEven(i);

            try {
                Thread.sleep(500);
            }

            catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class PrintOdd extends Thread {
    
    Printer p;
    int num;

    public PrintOdd(Printer p, int num) {
        this.p = p;
        this.num = num;
    }

    public void run() {

        for(int i = 1; i <= num; i = i + 2) {
            p.printOdd(i);
        

            try {
                Thread.sleep(500);
            }

            catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
public class MT5 {
    
    public static void main(String[] args) {
        
        Printer p = new Printer();

        PrintEven pe = new PrintEven(p, 10);
        PrintOdd po = new PrintOdd(p, 10);

        po.start();
        pe.start();
        
    }
}
