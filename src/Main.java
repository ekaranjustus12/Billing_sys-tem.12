import java.util.*;
import javax.swing.JOptionPane;
 class Items{
   private String item;
    private double price;
   private int quantity;
   private double totalPrice;



    public  void input(){
       item = JOptionPane.showInputDialog("item:");
       quantity =Integer.parseInt(JOptionPane.showInputDialog("quantity:"));
       price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price:"));

    }

    
    public void calculate(){
       totalPrice = quantity * price;
    }
    public  void outPut(){
       System.out.print("\titem " + item);
        System.out.print("\tquantity " + quantity);
        System.out.println("\tprice " + price);
        System.out.print("\ttotal price " + totalPrice);

    }
    public void display(){
        System.out.println("\nserved by jeptoo");
        System.out.println("....Thank you for shopping with us....");

    }
 }
public class Main {
    public static void main(String[] args) {
        Items item1 = new Items();
        Items item2 = new Items();
        item1.input();
        item2.input();
        item1.calculate();
        item2.calculate();
        item1.outPut();
        item2.outPut();
        item1.display();
        

    }
}