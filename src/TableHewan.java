import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableHewan {
    JFrame frame;
    JTable table;
    TableHewan()
    {
        frame = new JFrame();
        frame.setTitle("Tabel Hewan");
        String[][] data = {
                { "Kucing", "4"},
                { "Kangguru", "2"}
        };
        String[] columnNames = { "Name", "Jumlah kaki"};
        table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new TableHewan();
    }
}