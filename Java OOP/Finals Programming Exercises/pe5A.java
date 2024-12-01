/*
5. a.  Write an application that allows a user to select one of at least five television shows to watch on demand.
When the user selects a show, display a brief synopsis. Save the file as JTVDownload.java.
b. Change the JTVDownload application to include an editable combo box. Allow the user to type the name 
of a television show and display an appropriate error message if the desired show is not available. Save the 
file as JTVDownload2.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe5A extends JFrame implements ItemListener
{
   JLabel title = new JLabel("Television Shows");
   JLabel l1 = new JLabel("Select one");
   
   JLabel desc1 = new JLabel();
   JLabel desc2 = new JLabel();
   JLabel desc3 = new JLabel();
   JLabel desc4 = new JLabel();
   JLabel desc5 = new JLabel();
   JLabel desc6 = new JLabel();
   
   JComboBox <String> list = new JComboBox <> ();
   String[] tvShows = new String[7];
   
   
   public pe5A()
   {
      super("Television Shows");
      setSize(330, 200);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      tvShows[0] = "";
      tvShows[1] = "Tom and Jerry";
      tvShows[2] = "Hello Kitty";
      tvShows[3] = "Oggy and the Cockroaches";
      tvShows[4] = "Steven Universe";
      tvShows[5] = "Gravity Falls";
      tvShows[6] = "Cat Dog";
      for(int i = 0; i < tvShows.length; i++)
      {
         list.addItem(tvShows[i]);
      }
      
      title.setFont(new Font("Times New Roman", Font.ITALIC, 25));
      
      add(Box.createHorizontalStrut(50));
      add(title);
      add(Box.createHorizontalStrut(50));
      
      add(Box.createHorizontalStrut(90));
      add(l1);
      add(Box.createHorizontalStrut(90));
      add(list);
      
      list.setMaximumRowCount(3);      
      list.addItemListener(this);
      
      
      setVisible(true);    
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int selected = list.getSelectedIndex();
      
      switch(selected)
      {
         case 0:
            remove(desc1);
            remove(desc2);
            remove(desc3);
            remove(desc4);
            remove(desc5);
            remove(desc6);
            revalidate();
            repaint();
            break;
         case 1:
            desc1.setText("<html><center>Tom and Jerry is a boang nga<br> cat and mouse HAHAHA</center></html>");
            remove(desc2);
            remove(desc3);
            remove(desc4);
            remove(desc5);
            remove(desc6);
            add(desc1);
            revalidate();
            repaint();
            break;
         case 2:
            desc2.setText("<html><center>Hello Kitty is all about pa cute cute nga mga <br>stuff toys para mamalit mga bata</center></html>");
            remove(desc1);
            remove(desc3);
            remove(desc4);
            remove(desc5);
            remove(desc6);
            add(desc2);
            revalidate();
            repaint();
            break;
         case 3:
            desc3.setText("<html><center>Oggy and Cockroaches is all about the crazy<br>adventures of Oggy living with the cockroaches</center></html>");
            remove(desc1);
            remove(desc2);
            remove(desc4);
            remove(desc5);
            remove(desc6);
            add(desc3);
            revalidate();
            repaint();
            break;
         case 4:
            desc4.setText("<html><center>Steven Universe is a crazy harem cartoon with<br> lesbian supporting characters</center></html>");
            remove(desc1);
            remove(desc2);
            remove(desc3);
            remove(desc5);
            remove(desc6);
            add(desc4);
            revalidate();
            repaint();
            break;
         case 5:
            desc5.setText("<html><center>Gravity Falls is the horror adventures of <br>Mabel and Dipper Pines</center></html>");
            remove(desc1);
            remove(desc2);
            remove(desc3);
            remove(desc4);
            remove(desc6);
            add(desc5);
            revalidate();
            repaint();
            break;
         case 6:
            desc6.setText("<html><center>Cat Dog is the krezy shits of CATDOG combined<br> hayst taas pagyud kaayo </center></html>");
            remove(desc1);
            remove(desc2);
            remove(desc3);
            remove(desc4);
            remove(desc5);
            add(desc6);
            revalidate();
            repaint();
            break;
         
      }
      
      
   }
   
}

class DemoPe5A
{
   public static void main(String[]args)
   {
      pe5A p = new pe5A();
   }
}