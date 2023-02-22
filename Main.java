import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Main
{
    public static void main(String[] args)
    {
        //Pour déinier le frame
        // Le JFrame est un composant qui permet de créer une fenêtre pour contenir d'autres composants.
        JFrame frame = new JFrame("Freek");

        // JLabel est une zone pour afficher une chaîne courte ou une image ou les deux.
        JLabel label = new JLabel("Premier test!", JLabel.CENTER);
        frame.add(label);

        // Définir un panel
        // JPanel est un conteneur populaire pour contenir différents composants.
        JPanel panel = new JPanel();

        // Définir les boutons
        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Two");
        
        // Ajouter les boutons au frame
        panel.add(button1);
        panel.add(button2);

        // Ajouter label et panel au frame
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(panel);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}