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

public class pe4 extends JFrame
{
   final int PARKSIDE = 600;
   final int POOLSIDE = 750;
   final int LAKESIDE = 825;
   int total = 0;
   
   public pe4()
   {
   
   }
}

class DemoPe4
{
   public static void main(String[]args)
   {
      pe4 p = new pe4();
   }
}