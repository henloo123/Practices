/*
2. a. Write an application that instantiates a JFrame that contains a JButton. Disable the JButton after the
user clicks it. Save the file as JFrameDisableButton.java.
b. Modify the JFrameDisableButton program so that the JButton is not disabled until the user has
clicked at least eight times. At that point, display a JLabel that indicates “That’s enough!” Save the file as
JFrameDisableButton2.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe2 extends JFrame implements ActionListener
{
   int ctr = 0;
   JLabel l1 = new JLabel();
   JLabel l2 = new JLabel("Button disabled!");
   JButton b1 = new JButton("Click me!");
   
   public pe2()
   {
      super("Exercise 2");
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 200);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      add(new JLabel("This is a program that disables the button when"));
      add(Box.createHorizontalStrut(50));
      add(new JLabel("clicked 8 times"));
      add(Box.createHorizontalStrut(50));

      add(Box.createHorizontalStrut(90));
      add(b1);
      add(Box.createHorizontalStrut(90)); 
      b1.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == b1)
         ctr++;
      if(ctr == 8)
      {
         b1.setEnabled(false);
         add(l2);
         revalidate();
      }
   }
   
}

class DemoPe2
{
   public static void main(String[]args)
   {
      pe2 p = new pe2();
   }
}