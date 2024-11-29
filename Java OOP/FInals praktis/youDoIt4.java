import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class youDoIt4 extends JFrame implements ActionListener
{
   JLabel l1 = new JLabel("Name?");
   JLabel l2 = new JLabel("");
   JTextField tf1 = new JTextField(13);
   JButton b1 = new JButton("Ok");
   
   public youDoIt4()
   {
      super("Other Shits");
      this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setSize(350, 100);
      this.setLocationRelativeTo(null);
      this.setLayout(new FlowLayout());
      
      this.add(l1);
      this.add(tf1);
      this.add(b1);
      this.add(l2);
      
      b1.addActionListener(this);
      tf1.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == b1)
      {
         l2.setText("You clicked the button!");
         l1.setText("Thank you, " + tf1.getText());
      }
      else
      {
         l2.setText("You pressed Enter!");
         l1.setText("Thank you, " + tf1.getText());
      }
   }
}

class Demo4
{
   public static void main(String[]args)
   {
      youDoIt4 y = new youDoIt4();
   }
}
