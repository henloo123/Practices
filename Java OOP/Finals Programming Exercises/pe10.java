/*
10. Create an application for Paula’s Portraits, a photography studio. The application allows users to compute
the price of a photography session. Paula’s base price is $40 for an in-studio photo session with one person.
The in-studio fee is $75 for a session with two or more subjects, and $95 for a session with a pet. A $90 fee is
added to take photos on location instead of in the studio. Include a set of mutually exclusive check boxes to
select the portrait subject and another set for the session location. Include labels as appropriate to explain the
application’s functionality. Save the file as JPhotoFrame.java.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class pe10 extends JFrame implements ItemListener
{
   final int BASE_PRICE = 40;
   final int MANY_PRICE = 75;
   final int WITH_PET = 95;
   final int OUTSIDE = 90;
   int calc = 0;
   
   ButtonGroup subject = new ButtonGroup();
   ButtonGroup location = new ButtonGroup();
   
   JLabel s = new JLabel("Subject/s of Photoshoot");
   JLabel l = new JLabel("Location of Photoshoot");
   JLabel t = new JLabel("Total Cost");
   
   JCheckBox solo = new JCheckBox("Solo +$" + BASE_PRICE);
   JCheckBox withGroup = new JCheckBox("Two or More +$" + MANY_PRICE);
   JCheckBox withPet = new JCheckBox("With Pet +$" + WITH_PET);
   
   JCheckBox inside = new JCheckBox("In Studio +$0");
   JCheckBox outside = new JCheckBox("Out Studio +$" + OUTSIDE);
   
   JTextField total = new JTextField("$",4);
   
   public pe10()
   {
      super("Paula's Portraits");
      setSize(380, 200);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      s.setFont(new Font("Times New Roman", Font.ITALIC, 18));
      l.setFont(new Font("Times New Roman", Font.ITALIC, 18));
      
      subject.add(solo);
      subject.add(withGroup);
      subject.add(withPet);
      
      add(Box.createHorizontalStrut(80));
      add(s);
      add(Box.createHorizontalStrut(80));
      add(solo);
      add(withGroup);
      add(withPet);
      
      location.add(inside);
      location.add(outside);
      
      add(Box.createHorizontalStrut(65));
      add(l);
      add(Box.createHorizontalStrut(65));
      
      add(Box.createHorizontalStrut(65));
      add(inside);
      add(outside);
      add(Box.createHorizontalStrut(65));
      
      add(t);
      add(total);
      
      solo.addItemListener(this);
      withGroup.addItemListener(this);
      withPet.addItemListener(this);
      inside.addItemListener(this);
      outside.addItemListener(this);
      
      setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int select = e.getStateChange();
      
      if(source == solo)
      {
         if (select == ItemEvent.SELECTED)  calc += BASE_PRICE;
         else  calc -= BASE_PRICE;
      }
      else if(source == withGroup)
      {
         if (select == ItemEvent.SELECTED)  calc += MANY_PRICE;
         else  calc -= MANY_PRICE;
      }
      else if (source == withPet)
         if (select == ItemEvent.SELECTED)  calc += WITH_PET;
         else  calc -= WITH_PET;
         
      if(source == inside)
      {
         if(select == ItemEvent.SELECTED) calc += 0;
         else calc -= 0;
      }
      else if(source == outside)
      {
         if(select == ItemEvent.SELECTED) calc += OUTSIDE;
         else calc -= OUTSIDE;
      }
         
      total.setText("$" + calc );
   }
}

class DemoPe10
{
   public static void main(String[]args)
   {
      new pe10();
   }
}