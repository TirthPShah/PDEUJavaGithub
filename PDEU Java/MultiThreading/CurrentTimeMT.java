import java.util.Date;
import java.text.SimpleDateFormat;

class Timer extends Thread {

    Date now = new Date();
    SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");

    public void run() {

        while(true) {
            
            System.out.print("\r" + sd.format(now));

            try {
                Thread.sleep(1000);
            }

            catch (Exception e) {
                System.out.println(e);
            }

            now = new Date();
        }
    }
}

public class CurrentTimeMT {
  
    public static void main(String[] args) {
      
        Timer t1 = new Timer();
        t1.start();
      
    }
}