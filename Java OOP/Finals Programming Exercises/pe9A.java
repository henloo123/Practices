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

public class pe9A extends JFrame
{
   JLabel l1 = new JLabel("Dormitory Room");
   JTextArea ta1 = new JTextArea(15, 12);
   
   JCheckBox op1 = new JCheckBox("Private Room");
   JCheckBox op2 = new JCheckBox("Internet Connection");
   JCheckBox op3 = new JCheckBox("Cable TV Connection");
   JCheckBox op4 = new JCheckBox("Microwave");
   JCheckBox op5 = new JCheckBox("Refrigerator");
   
   public pe9A()
   {
      super("Dormitory Room");
      setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      setSize(200, 500);
      setLocationRelativeTo(null);
      setLayout(new FlowLayout());
      
      l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(l1);
      add(op1);
      add(op2);
      add(op3);
      add(op4);
      add(op5);
      
      add(ta1);
      
      setVisible(true);
   }
}

class DemoPe9A
{
   public static void main(String[]args)
   {
      pe9A p = new pe9A();
   }
}
