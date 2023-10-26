import java.io.*;

public class SecondIO {
    public static void main(String[] args) {
        
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("SecondSource.txt"));
            bw = new BufferedWriter(new FileWriter("SecondDestination.txt"));
            
            String tof = "Tirth";
            String tor = "Oracle";

            String name = br.readLine();
            
            while(name != null) {

                name = name.replaceAll(tof, tor);

                bw.append(name);
                bw.append("\n");

                name = br.readLine();
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }

        finally {

            try {
                br.close();
                bw.close();
            }

            catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }
}
