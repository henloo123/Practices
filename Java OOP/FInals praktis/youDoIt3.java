import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Simple ActionEvent implementation

public class youDoIt3 extends JFrame implements ActionListener
{
   JLabel l1 = new JLabel("Name?");
   JTextField tf1 = new JTextField(12);
   JButton b1 = new JButton("OK");
   
   public youDoIt3()
   {
      super("Components with Action!");
      this.setSize(350, 100);
      this.setLayout(new FlowLayout());
      this.setVisible(true);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      
      this.add(l1);
      this.add(tf1);
      this.add(b1);
      
      b1.addActionListener(this);
      tf1.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      l1.setText("Thank you so much!");
      b1.setText("Application done!");
   }
}

class Demo3
{
   public static void main(String[]args)
   {
      youDoIt3 y = new youDoIt3();
   }
}