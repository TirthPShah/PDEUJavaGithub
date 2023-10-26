import java.util.*;
import java.io.*;

public class FourthIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;

        System.out.print("Enter the number of entries: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        try {
            bw = new BufferedWriter(new FileWriter("Fourth.txt"));

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter the name of the " + i + "th person: ");
                String name = sc.nextLine().trim(); // Read the entire line and trim whitespace
                System.out.print("Enter marks for " + name + ": ");
                int marks = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                bw.write(name + " " + marks); // Add space between name and marks
                bw.newLine();
            }

            br = new BufferedReader(new FileReader("Fourth.txt"));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                System.out.println(arr.length);

                if (arr.length == 2) {
                    String name = arr[0];
                    int marks = Integer.parseInt(arr[1]);

                    if (marks > 70) {
                        System.out.println(name + " has scored " + marks + " marks.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
                if (sc != null) sc.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
