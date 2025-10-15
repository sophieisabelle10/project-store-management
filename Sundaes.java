public class Sundaes extends IceCream{

  private String topping;
  private boolean whippedCream;

  /*
  *
  */No argument constructor
  public Sundaes(){
    this.topping = "Chocolate Chips";
    this.whippedCream = true;
  }
  
/*
*
*/Parameritized Constructor
public Sundaes(String flavor, String size, double price, String topping, boolean whippedCream) {
    super(flavor, size, price); // private instance variables in Dessert class
    this.topping=topping;
    this.whippedCream = whippedCream;
  }

    /*
    *
    */Accessor Methods
   public String getTopping(){
    return topping;
  }

  public boolean getWhippedCream(){
    return whippedCream;
  }

  /*
  *
  */toString method
  public String toString() {
  return super.toString() + ", Topping: " + topping + ", Whipped Cream: " + whippedCream;
}
}