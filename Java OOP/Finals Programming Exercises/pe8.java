/*
8. Write an application that allows the user to choose insurance options in JCheckBoxes. Use a ButtonGroup 
to allow the user to select only one of two insurance types—HMO (health maintenance organization) or PPO 
(preferred provider organization). Use regular (single) JCheckBoxes for dental insurance and vision insurance 
options; the user can select one option, both options, or neither option. As the user selects each option, display 
its name and price in a text field; the HMO costs $200 per month, the PPO costs $600 per month, the dental 
coverage adds $75 per month, and the vision care adds $20 per month. When a user deselects an item, make 
the text field blank. Save the file as JInsurance.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe8 extends JFrame implements ItemListener
{
   final int HMO = 200;
   final int PPO = 600;
   final int DENTAL = 75;
   final int VISION = 20;
   int calc = 0;
   
   JLabel l1 = new JLabel();
   JLabel l2 = new JLabel("Total Cost:");
   
   ButtonGroup iType = new ButtonGroup();
   JCheckBox b1 = new JCheckBox("HMO");
   JCheckBox b2 = new JCheckBox("PPO");
   
   JCheckBox b3 = new JCheckBox("Dental Insurance");
   JCheckBox b4 = new JCheckBox("Vision Insurance");
   
   JTextField total = new JTextField(4);
   public pe8()
   {
      super("Insurance");
      setSize(300, 200);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      iType.add(b1);
      iType.add(b2);
      
      add(b1);
      add(b2);
      
      add(b3);
      add(b4);
      
      add(l2);
      add(total);
      
      b1.addItemListener(this);
      b2.addItemListener(this);
      b3.addItemListener(this);
      b4.addItemListener(this);
      
      setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int selection = e.getStateChange();
      
      if(source == b1)
      {
         if(selection == ItemEvent.SELECTED)
            calc += HMO;
         else
            calc -= HMO;
         total.setText("" + calc);
      }
      else if(source == b2)
      {
         if(selection == ItemEvent.SELECTED)
            calc += PPO;
         else
            calc -= PPO;
         total.setText("" + calc);
      }
      
      if(source == b3)
      {
         if(selection == ItemEvent.SELECTED)
         {   
            calc += DENTAL;
            total.setText("" + calc);
         }
         else
         {
            calc -= DENTAL;
            total.setText("");
         }
      }
      
      if(source == b4)
      {
         if(selection == ItemEvent.SELECTED)
         {   
            calc += VISION;
            total.setText("" + calc);
         }
         else
         {
            calc -= VISION;
            total.setText("");
         }
      }      
      
      
   }
}

class DemoPe8
{
   public static void main(String[]args)
   {
      pe8 p = new pe8();
   }
}
