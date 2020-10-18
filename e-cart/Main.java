//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  void setPrice(int price)
  {
    this.price = price ;
  }
  int getPrice()
  {
    return price ;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  void setProduct(String prod)
  {
    this.product = prod;
    
  }
  String getProduct()
  {
    return product;
  }
  void setQuantity(int quant)
  {
    this.quantity = quant ;
  }
  int getQuantity()
  {
    return quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  int total ;
  void bill(int p , int q )
  {
   int result = p*q ;
   System.out.print("Total Price is : "+result);
   }
  
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String prod = in.nextLine();
    int price = in.nextInt();
    int quant = in.nextInt();
    Item i = new Item();
    i.setPrice(price);
    int p = i.getPrice();
    Customer c = new Customer();
    c.setQuantity(quant);
    int q = c.getQuantity();
    Bill obj = new Bill();
    //write the logic here
    obj.bill(p,q);
  }
}