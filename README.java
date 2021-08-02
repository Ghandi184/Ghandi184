System.out.prntln("hello world");
int age = 0;
int adult = 150;
int child = 100;
int total = 0;
int amount = 0;
int childamount = 0;
int adultamount = 0;

   amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of people"));

      int adults = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of adults"));
      int children = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of children"));
      
         adultamount = (amount - adults);
         childamount = (amount - children);

   age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));

   if (age > 12) {

      System.out.prntln("The price of your ticket will be R " + adult));

   else

      System.out.prntln("The price of your ticket will be R " + child));

   price1 = adultamount;
   price2 = childamount;

   total = price1 + price2;

System.out.prntln("Your total for the tickets is: " + total);

}
