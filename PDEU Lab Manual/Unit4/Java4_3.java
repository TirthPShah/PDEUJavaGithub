import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Java4_3 {

    private JFrame frame;
    private JTextArea codeArea;

    public Java4_3() {

        frame = new JFrame("Java4_3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();

        int[] noOfProg = {8, 4, 15, 6};

        for (int unit = 1; unit <= noOfProg.length; unit++) {

            JMenu unitMenu = new JMenu("Unit " + unit);

            for (int prog = 1; prog <= noOfProg[unit - 1]; prog++) {

                String progName = "Java" + unit + "_" + prog;

                JMenuItem menuItem = new JMenuItem("Open " + progName);
                String actionCommand = "Unit" + unit + " " + progName;

                menuItem.setActionCommand(actionCommand);
                menuItem.addActionListener(new MenuItemListener());

                unitMenu.add(menuItem);
            }

            menuBar.add(unitMenu);
        }

        frame.setJMenuBar(menuBar);

        codeArea = new JTextArea();
        codeArea.setEditable(false);
        codeArea.setFont(new Font("Courier New", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(codeArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    class MenuItemListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String actionCommand = e.getActionCommand();

            String[] parts = actionCommand.split(" ");

            String unitName = parts[0];
            String lessonName = parts[1];
            String fileName = "../" + unitName + "/" + lessonName + ".java";

            BufferedReader reader = null;

            try {

                reader = new BufferedReader(new FileReader(fileName));

                codeArea.setText("");

                String line = reader.readLine();

                while (line != null) {
                    
                    codeArea.append(line);
                    codeArea.append("\n");
                    line = reader.readLine();

                }

            } 
            
            catch (Exception er) {
                codeArea.setText(er.toString());
            }

            finally {

                try {
                    reader.close();
                }

                catch (Exception er) {
                    codeArea.setText(er.toString());
                }
            }
        }
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Java4_3();
        });
    }
}
