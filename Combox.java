import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.GridLayout;

public class Combox {
    public static void main(String[] args)
    {
        // Définir un frame
        JFrame frame = new JFrame("Vision");

        // Créer un tableau de données
        String[] languages = {"PHP", "Java", "Python", "C++", "Ruby"};

        // Créer une liste déroulante
        // JComboBox est un composant permettant de sélectionner une vfaleur dans une liste déroulante.
        JComboBox combox = new JComboBox(languages);

        frame.setLayout(new GridLayout(6, 1));
        frame.add(combox);

        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
