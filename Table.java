import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
    public static void main(String[] args)
    {
        // Définir un frame
        JFrame frame = new JFrame("My Frame");

        // L'en-têtes du JTable
        String[] column = {"ID", "Nom", "Age", "Adresse"};

        // Les lignes du JTable
        String[][] data = {
            {"01", "Thomas", "55", "Paris"}, 
            {"02", "Emily", "45", "Marseille"}, 
            {"03", "Yohan", "12", "Lyon"}, 
            {"04", "Jean", "29", "Toulouse"},
            {"05", "Bob", "30", "Nice"}
        };

        // JTable est utilisé pour créer des tables bidimensionnelles. La table peut afficher des données à l'intérieur. 
        // Synthaxe ==> JTable(données, en-têtes)
        JTable table = new JTable(data, column);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll);

        frame.pack();
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
