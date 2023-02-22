import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;

public class Radio {
    public static void main(String[] args)
    {
        // Définissons le frame
        JFrame frame = new JFrame("Second Test");

        JLabel label = new JLabel("Second Test", JLabel.CENTER);

        // Définissons le panel
        JPanel panel = new JPanel();

        // Crééons les boutons de type radio
        ButtonGroup group = new ButtonGroup();

        // JRadioButton permet de créer des boutons de type radio qui peuvent être sélectionnés ou désélectionnés. Généralement on l'utilise avec l'objet ButtonGroup pour créer un groupe de boutons, dans lequel un seul bouton peut être sélectionné à la fois.
        JRadioButton radio1 = new JRadioButton("ON", true);
        JRadioButton radio2 = new JRadioButton("OFF", false);

        // Ajoutons les boutons radios au groupe
        group.add(radio1);
        group.add(radio2);

        // Ajoutons les boutons dans le frame
        panel.add(radio1);
        panel.add(radio2);

        // Ajoutons le label et panel au frame
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(panel);

        frame.pack();
        frame.setSize(250, 250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
