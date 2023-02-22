import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class CheckBox {
    public static void main(String[] args)
    {
        // Définissons le frame
        JFrame myFrame = new JFrame("Troisième test");

        // Définissons un label
        JLabel myLabel = new JLabel("Mon troisième test", JLabel.CENTER);
        
        // Définissons un panel
        JPanel myPanel = new JPanel();

        // Crééons des cases à cocher
        // Avec JCheckBox on peut créer plusieurs case à cocher, dont on peut cocher plusieurs case à la fois.
        JCheckBox checkBox1 = new JCheckBox("Learn Java", true);
        JCheckBox checkBox2 = new JCheckBox("Learn Javascript");
        JCheckBox checkBox3 = new JCheckBox("Learn PHP", true);

        // Ajoutons les cases à cocher au frame
        myPanel.add(checkBox1);
        myPanel.add(checkBox2);
        myPanel.add(checkBox3);

        // Ajoutons label et panel au frame
        myFrame.setLayout(new GridLayout(2, 1));
        myFrame.add(myLabel);
        myFrame.add(myPanel);

        myFrame.setSize(250, 250);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
