import javax.swing.*;
import java.awt.*;

//This application creates a JLABEL, JTEXTFIELD, and JBUTTON.
public class youDoIt2 extends JFrame
{
   JLabel l1 = new JLabel("Name?");
   JTextField tf1 = new JTextField(12);
   JButton b1 = new JButton("OK");
   
   public youDoIt2()
   {
      super("Henlo Bitch ");
      this.setLayout(new FlowLayout());
      this.add(l1);
      this.add(tf1);
      this.add(b1);
      this.setVisible(true);
      this.setLocationRelativeTo(null);
      this.setSize(350, 100);
      this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
   }
}

class Demo2
{
   public static void main(String[]args)
   {
      youDoIt2 y = new youDoIt2();
   }
}