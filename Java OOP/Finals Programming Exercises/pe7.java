/*
 7. Write an application that allows a user to select a country from a list box that contains at least seven options. 
After the user makes a selection, display the country’s capital city. Save the file as JCapitals.java.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class pe7 extends JFrame implements ItemListener
{
   JLabel header = new JLabel("<html><center>Choose a country to know its<br> Capital City</center></html>");
   
   JComboBox <String> c = new JComboBox <> ();
   
   JLabel c1 = new JLabel("Capital City");
   JTextField city = new JTextField(8);   
   public pe7()
   {
      super("Capital Cities");
      setSize(300, 130);
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      c.addItem("None");
      c.addItem("Philippines");
      c.addItem("Japan");
      c.addItem("Australia");
      c.addItem("Thailand");
      c.addItem("Korea");
      c.addItem("New Zealand");
      c.addItem("USA");
      
      header.setFont(new Font("Times New Roman", Font.BOLD, 20));
      add(header);
      add(c);
      
      add(c1);
      add(city);
      
      c.addItemListener(this);
      
      setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int selection = c.getSelectedIndex();
      
         if(selection == 1)
         {
            city.setText("Manila City");
         }
         else if(selection == 2)
         {
            city.setText("Tokyo");
         }
         else if(selection == 3)
         {
            city.setText("Animal");
         }
         else if(selection == 4)
         {
            city.setText("hala");
         }
         else if(selection == 5)
         {
            city.setText("Yoko na");
         }
         else if(selection == 6)
         {
            city.setText("yeshh");
         }
         else if(selection == 7)
         {
            city.setText("Arayyy");
         }
         else
         {
            city.setText("");
         }
     
   }
}

class DemoPe7
{
   public static void main(String[]args)
   {
      pe7 p = new pe7();
   }
}