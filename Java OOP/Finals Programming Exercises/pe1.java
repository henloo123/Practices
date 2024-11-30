/*
1. a. Write an application that displays a JFrame containing the opening sentence or two from your favorite
book. Save the file as JBookQuote.java.
b. Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of
the book that contains the quote. Save the file as JBookQuote2.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe1 extends JFrame implements ActionListener
{
   JLabel l1 = new JLabel("It was a dark and scary night!");
   JLabel l2 = new JLabel("Tom and Jerry");
   JButton b1 = new JButton("Click here to reveal the title");
   
   public pe1()
   {
      setLocationRelativeTo(null);
      setVisible(true);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 150);
      
      add(l1);
      l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(b1);
      b1.addActionListener(this);
      
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == b1)
      {
         l2.setFont(new Font("Times New Roman", Font.ITALIC, 30));
         add(l2);
         revalidate();
      }
   }
}

class DemoPe1
{
   public static void main(String[]args)
   {
      pe1 p = new pe1();
   }
}