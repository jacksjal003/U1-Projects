import javax.swing.*;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {

        String salePrice = JOptionPane.showInputDialog("What is your sales price?");
        String itemsBuying = JOptionPane.showInputDialog("How many items are you going to buy");
        String discount = JOptionPane.showInputDialog("What is the discount");
        String salesTax = JOptionPane.showInputDialog("what is your sales tax?");


        String message = "hi";

        double salePrice2 = salePrice * itemsBuying;
        double discountPrice = salePrice2  * discount;
        String purchasePrice =  discountPrice * 1 + salesTax;

        double firstPrice = salePrice2 - (salePrice2 * discount);
        double secondPrice = salePrice2 - firstPrice;
        double finalPrice = secondPrice * salesTax;

        System.out.println(message + " Your sale price is " + salePrice2);
        System.out.println(message + " Your discount is " + discount);
        System.out.println(message + " Your tax is "  + salesTax);
        System.out.println(message + " Your total price is " + finalPrice);






    }
}
