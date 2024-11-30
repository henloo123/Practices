/*
3. Create an application with a JFrame and at least six labels that contain facts about your favorite topic—for
example, the French Revolution or astronomy. Every time the user clicks a JButton, remove one of the labels
and add a different one. Save the file as JFacts.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe3 extends JFrame implements ActionListener
{
   int ctr = 1;
   JLabel title = new JLabel("Six Astronomy Facts");
   JLabel l1 = new JLabel("<html><center> A Diamond Planet: A planet, pulsating white dwarf<br>BPM 37093, is believed to be primarily<br>composed of carbon, crystallized<br>into a massive diamond.</center> </html>");
   JLabel l2 = new JLabel("<html><center>Water Bears in Space: Tardigrades, microscopic<br> creatures, have survived exposure to <br>the vacuum of space.</center></html>");
   JLabel l3 = new JLabel("<html><center>A Day on Venus is Longer Than Its Year: Venus<br> rotates slowly, making a day longer <br>than its year.</center></html>");
   JLabel l4 = new JLabel("<html><center>The Milky Way Smells Like Rum and Raspberries:<br> The galaxy's aroma is due to <br>specific chemicals.</center></html>");
   JLabel l5 = new JLabel("<html><center>The Universe is Expanding Faster Than Light: <br>Distant galaxies are moving away from <br>us at incredible speeds.</center></html>");
   JLabel l6 = new JLabel("<html><center>A Spoonful of Neutron Star Weighs as Much as<br> a Mountain: Neutron stars are <br>incredibly dense.</center></html>");
   
   JButton b1 = new JButton("Click here to know some Facts");
   
   public pe3()
   {
      super("Astronomy Facts");
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setSize(350, 180);
      setVisible(true);
      setLayout(new FlowLayout());
      
      title.setFont(new Font("Times New Roman", Font.BOLD, 30));
      add(title);
      add(b1);
      b1.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == b1)
      {
         switch(ctr)
         {
            case 1:
               remove(l6);
               add(l1);
               revalidate();
               repaint();
               ctr++;
               break;
            case 2:
               remove(l1);
               add(l2);
               revalidate();
               repaint();
               ctr++;
               break;
            case 3:
               remove(l2);
               add(l3);
               revalidate();
               repaint();
               ctr++;
               break;
            case 4:
               remove(l3);
               add(l4);
               revalidate();
               repaint();
               ctr++;
               break;
            case 5:
               remove(l4);
               add(l5);
               revalidate();
               repaint();
               ctr++;
               break;
            case 6:
               remove(l5);
               add(l6);
               revalidate();
               repaint();
               ctr = 1;
               break;
         }
      }
   }
}

class DemoPe3
{
   public static void main(String[]args)
   {
      pe3 p = new pe3();   
   }
}