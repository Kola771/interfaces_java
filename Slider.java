import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import java.awt.GridLayout;

public class Slider 
{
    public static void main(String[] args) 
    {
        // Définissez le frame
        JFrame frame = new JFrame("Slider");

        JPanel panel = new JPanel();
         
        // Définissez le slider
        // JSlider est un composant qui permet aux utilisateurs de sélectionner une valeur en faisant glisser un bouton dans un intervalle spécifié.
        JSlider slider = new JSlider();
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
    
        frame.setLayout(new GridLayout(2, 1));
        frame.add(slider);
        frame.pack();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}