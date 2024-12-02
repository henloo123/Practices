/*
6. Design an application for the Sublime Sandwich Shop. The user makes sandwich order choices from list boxes,
and the application displays the price. The user can choose from three main sandwich ingredients of your
choice (for example, chicken) at three different prices. The user also can choose from three different bread
types (for example, rye). Save the file as JSandwich.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe6 extends JFrame implements ItemListener
{
   JLabel title = new JLabel("Sublime Sandwich Shop");
   JLabel meat = new JLabel("Select a Meat: ");
   JLabel bread = new JLabel("Select a Bread: ");
   
   JComboBox <String> mIngredients = new JComboBox<>();
   JComboBox <String> bTypes = new JComboBox <>();
   
   JLabel total = new JLabel("Total: ");
   JTextField calc = new JTextField(4);
   
   int totalPrice = 0;
   
   public pe6()
   {
      super("Sublime Sandwich Shop");
      setSize(300, 200);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      title.setFont(new Font("Times New Roman", Font.BOLD, 20));
      add(title);
      add(meat);
      add(Box.createHorizontalStrut(45));
      mIngredients.addItem("None");
      mIngredients.addItem("Chicken");
      mIngredients.addItem("Beef");
      mIngredients.addItem("Fish");
      add(mIngredients);
      add(Box.createHorizontalStrut(45));
      
      
      add(bread);
      add(Box.createHorizontalStrut(45));
      bTypes.addItem("None");
      bTypes.addItem("Rye");
      bTypes.addItem("Wheat");
      bTypes.addItem("Corn");
      add(bTypes);
      add(Box.createHorizontalStrut(45));
      
      add(total);
      add(calc);
      
      mIngredients.addItemListener(this);
      bTypes.addItemListener(this);
      
      setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      totalPrice = 0;
      Object source = e.getSource();
      int selection1 = mIngredients.getSelectedIndex();
      int selection2 = bTypes.getSelectedIndex();
      
      if(selection1 == 1)
      {
         totalPrice += 100;
      }
      else if(selection1 == 2)
      {
         totalPrice += 150;
      }
      else if(selection1 == 3)
      {
         totalPrice += 120;
      }
      else
      {
         totalPrice += 0;
      }
      
      if(selection2 == 1)
         totalPrice += 50;
      else if (selection2 == 2)
         totalPrice += 30;
      else if(selection2 == 3)
         totalPrice += 20;
      else
         totalPrice += 0;
      
      calc.setText("$" + totalPrice);
      revalidate();
      
   }
}

class DemoPe6
{
   public static void main(String[]args)
   {
      pe6 p = new pe6();
   }
}
