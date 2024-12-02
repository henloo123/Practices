/*
9. a.  Search the Internet for information about how to use a JTextArea, its constructors, and its setText() 
and append() methods. Write an application that allows the user to select options for a dormitory room. 
Use JCheckBoxes for options such as private room, Internet connection, cable TV connection, microwave, 
refrigerator, and so on. When the application starts, use a text area to display a message listing the options 
that are not yet selected. As the user selects and deselects options, add appropriate messages to the text 
area so it accumulates a running list that reflects the user’s choices. Save the file as JDorm.java.
 b. Modify the JDorm application so that instead of a running list of the user’s choices, the application displays 
only the current choices. Save the file as JDorm2.java.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pe9A extends JFrame implements ItemListener
{
   JLabel l1 = new JLabel("Dormitory Room");
   JLabel l2 = new JLabel("Unselected Options");
   JTextArea ta1 = new JTextArea(6, 12);
   JTextArea ta2 = new JTextArea(6, 12);
   
   String op1s = "- Private Room\n";
   String op2s = "- Internet Connection\n";
   String op3s = "- Cable TV Connection\n";
   String op4s = "- Microwave\n";
   String op5s = "- Refrigerator\n";
   
   
   JCheckBox op1 = new JCheckBox("Private Room");
   JCheckBox op2 = new JCheckBox("Internet Connection");
   JCheckBox op3 = new JCheckBox("Cable TV Connection");
   JCheckBox op4 = new JCheckBox("Microwave");
   JCheckBox op5 = new JCheckBox("Refrigerator");
   
   String remover = "";
   
   
   public pe9A()
   {
      super("Dormitory Room");
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setSize(200, 350);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(l1);
      add(op1);
      add(op2);
      add(op3);
      add(op4);
      add(op5);
      
      add(l2);
      ta1.append(op1s);
      ta1.append(op2s);
      ta1.append(op3s);
      ta1.append(op4s);
      ta1.append(op5s);
      
      remover = ta1.getText();
      
      ta1.setLineWrap(true);
      ta1.setEditable(false);
      add(ta1);
      
      op1.addItemListener(this);
      op2.addItemListener(this);
      op3.addItemListener(this);
      op4.addItemListener(this);
      op5.addItemListener(this);
      

      
      setVisible(true);
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      Object source = e.getSource();
      int selection = e.getStateChange();
      int start;
      int length;
      
      if(ta1.getText().contains(remover)) ta1.setText("");
      else{}
      
      
      l2.setText("Selected Choices");
      
      
      if(source == op1)
      {
         if(selection == ItemEvent.SELECTED)
         {
            ta1.append(op1s);
         }
         else
         {
            start = ta1.getText().indexOf(op1s);
            length = op1s.length();
            ta1.replaceRange("", start, (start + length));
         }
      }
      
      if(source == op2)
      {
         if(selection == ItemEvent.SELECTED)
         {
            ta1.append(op2s);
         }
         else
         {
            start = ta1.getText().indexOf(op2s);
            length = op2s.length();
            ta1.replaceRange("", start, (start + length));
         }
      }
      
      if(source == op3)
      {
         if(selection == ItemEvent.SELECTED)
         {
            ta1.append(op3s);
         }
         else
         {
            start = ta1.getText().indexOf(op3s);
            length = op3s.length();
            ta1.replaceRange("", start, (start + length));
         }
      }
      
      if(source == op4)
      {
         if(selection == ItemEvent.SELECTED)
         {
            ta1.append(op4s);
         }
         else
         {
            start = ta1.getText().indexOf(op4s);
            length = op4s.length();
            ta1.replaceRange("", start, (start + length));
         }
      }
      
      if(source == op5)
      {
         if(selection == ItemEvent.SELECTED)
         {
            ta1.append(op5s);
         }
         else
         {
            start = ta1.getText().indexOf(op5s);
            length = op5s.length();
            ta1.replaceRange("", start, (start + length));
         }
      }
   }
}

class DemoPe9A
{
   public static void main(String[]args)
   {
      pe9A p = new pe9A();
   }
}
