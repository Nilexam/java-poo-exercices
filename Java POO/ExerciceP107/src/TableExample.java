import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        JPanel panel = new JPanel();
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {
                {"John Doe", 30},
                {"Jane Smith", 25},
                {"Bob Johnson", 40}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}