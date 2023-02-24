import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Exemple JTextField");

        // JTextField est un composant qui permet de modifier une seule ligne de texte. Elle hérite de la classe JTextComponent et utilise l'interface SwingConstants.
        JTextField fields = new JTextField();
        fields.setBounds(20,40,200,28);

        JTextField  fields0 = new JTextField("Welcome");
        fields0.setBounds(20,80,200,28);

        frame.add(fields);
        frame.add(fields0);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
