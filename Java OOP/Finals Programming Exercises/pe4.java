/*
Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to select
one of three locations, the number of bedrooms, and whether meals are included in the rental. Assume that
the locations are parkside for $600 per week, poolside for $750 per week, or lakeside for $825 per week.
Assume that the rentals have one, two, or three bedrooms and that each number of bedrooms greater than one
adds $75 to the base price. Assume that if meals are added, the price is $200 more per rental. Save the file as
JVacationRental.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe4 extends JFrame implements ItemListener
{
   final int PARKSIDE = 600;
   final int POOLSIDE = 750;
   final int LAKESIDE = 825;
   final int BED = 75;
   final int MEAL = 200;
   int total = 0;
   
   JLabel title = new JLabel("Lambert's Vacation Rentals");
   JLabel loc = new JLabel("Select Location");
   JLabel bed = new JLabel("Select how many bed/s");
   JLabel tot = new JLabel("Total Cost ");
   
   JTextField calc = new JTextField("$" + total, 4);
   
   JCheckBox loc1 = new JCheckBox("Parkside $" + PARKSIDE);
   JCheckBox loc2 = new JCheckBox("Poolside $" + POOLSIDE);
   JCheckBox loc3 = new JCheckBox("Lakeside $" + LAKESIDE);
   
   JCheckBox bed1 = new JCheckBox("One");
   JCheckBox bed2 = new JCheckBox("Two");
   JCheckBox bed3 = new JCheckBox("Three");
   
   JCheckBox meal = new JCheckBox("With Meal");
   
   ButtonGroup locs = new ButtonGroup();
   ButtonGroup beds = new ButtonGroup();
   
   public pe4()
   {
      super("Lambert's Vacation Rentals");
      setSize(500, 350);
      setLayout(new FlowLayout());
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      title.setFont(new Font("Times New Roman", Font.BOLD, 35));
      
      
      locs.add(loc1);
      locs.add(loc2);
      locs.add(loc3);
      
      
      beds.add(bed1);
      beds.add(bed2);
      beds.add(bed3);
      
      add(title);
      add(Box.createVerticalStrut(80));
      
      add(loc);
      add(Box.createHorizontalStrut(45));
      add(loc1);
      add(loc2);
      add(loc3);
      
      add(bed);
      add(Box.createHorizontalStrut(90));
      add(bed1);
      add(bed2);
      add(bed3);
      add(Box.createHorizontalStrut(60));
      
      add(Box.createHorizontalStrut(250));
      add(meal);
      add(Box.createHorizontalStrut(80));
      
      add(Box.createHorizontalStrut(180));
      add(tot);
      add(calc);
      
      loc1.addItemListener(this);
      loc2.addItemListener(this);
      loc3.addItemListener(this);
      
      bed1.addItemListener(this);
      bed2.addItemListener(this);
      bed3.addItemListener(this);
      
      meal.addItemListener(this);
      
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int selected = e.getStateChange();
      
      if(source == loc1)
      {
         if(selected == ItemEvent.SELECTED)
            total += PARKSIDE;
         else
            total -= PARKSIDE;
      }
      else if (source == loc2)
      {
         if(selected == ItemEvent.SELECTED)
            total += POOLSIDE;
         else
            total -= POOLSIDE;
      }
      else if(source == loc3)
      {
         if(selected == ItemEvent.SELECTED)
            total += LAKESIDE;
         else
            total -= LAKESIDE;
      }
      
      if(source == bed1)
      {
         if(selected == ItemEvent.SELECTED){}
         else {}
      }
      else if (source == bed2)
      {
         if(selected == ItemEvent.SELECTED)
            total += BED;
         else
            total -= BED;
      }
      else if(source == bed3)
      {
         if(selected == ItemEvent.SELECTED)
            total += (BED * 2);
         else
            total -= (BED * 2);   
      }
      
      if(source == meal)
      {
         if(selected == ItemEvent.SELECTED)
            total += MEAL;
         else
            total -= MEAL;
      }
            
      calc.setText("$" + total);
      revalidate();
      repaint();
   }
}

class DemoPe4
{
   public static void main(String[]args)
   {
      pe4 p = new pe4();
   }
}
