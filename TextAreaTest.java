import javax.swing.*;
import java.awt.event.*;

public class TextAreaTest implements ActionListener
{
  JLabel l1, l2;

  // JTextArea est utilisé pour éditer du texte. Elle hérite de la classe JComponent.
  JTextArea text;
  
  public TextAreaTest()
  {
    JFrame frame = new JFrame();

    l1 = new JLabel();
    l1.setBounds(45,175,100,30);

    l2 = new JLabel();
    l2.setBounds(150,175,100,30);

    text = new JTextArea();
    text.setBounds(15,20,250,150);

    JButton btn = new JButton("Compter les mots");
    btn.setBounds(50,210,180,30);
    // Au clique de cet bouton, on fera appel à la fonction actionPerformed().
    btn.addActionListener(this);

    frame.add(text);
    frame.add(l1);
    frame.add(l2);
    frame.add(btn);

    frame.setSize(300,300);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    String string = text.getText();
    String mots[] = string.split("\\s");
    l1.setText("Mots: " + mots.length);
    l2.setText("Caractères: " + string.length());
  }
 
  public static void main(String[] args)
  {
    new TextAreaTest();
  }
  
}