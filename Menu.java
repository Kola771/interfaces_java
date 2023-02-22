import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.GridLayout;

public class Menu {
    public static void main(String[] args)
    {
        // Définir le frame
        JFrame frame = new JFrame("Menu");

        // Définir le panel
        JPanel panel = new JPanel();

        // Définir le menu principal

        // JMenu permet de créer un menu déroulant.
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("Fichier");
        JMenu edit = new JMenu("Edition");
        JMenu help = new JMenu("Aide");

        // Définir le sous-menu pour Fichier
        JMenuItem newf = new JMenuItem("Nouveau");
        JMenuItem quit = new JMenuItem("Ouvrir");
        JMenuItem save = new JMenuItem("Enregistrer");

        // Ajout des sous-menus dans Fichier
        file.add(newf);
        file.add(save);
        file.add(quit);

        // Ajout des menus principal
        menu.add(file);
        menu.add(edit);
        menu.add(help);

        frame.setLayout(new GridLayout(5, 1));

        // Ajout dans le frame du menu et du panel
        frame.add(menu);
        frame.add(panel);
        frame.pack();
        frame.setSize(500, 200);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
