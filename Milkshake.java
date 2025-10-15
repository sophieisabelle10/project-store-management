public class Milkshake extends IceCream{

  private String thickness;
  private boolean hasCherry;
  
  /*
  *
  */No argument constructor
  public Milkshake(){
    this.thickness = "Medium Thick";
    this.hasCherry = true;
  }
  
/*
*
*/Parameritized Constructor
  public Milkshake(String flavor, String size, double price, String thickness, boolean hasCherry) {
    super(flavor, size, price); // private instance variables in Dessert class
    this.thickness=thickness;
    this.hasCherry = hasCherry;
  }

    /*
    *
    */Accessor Methods
  public String getThickness(){
    return thickness;
  }

  public boolean getHasCherry(){
    return hasCherry;
  }
  
  //toString method
  public String toString() {
  return super.toString() + ", Thickness: " + thickness + ", Has Cherry: " + hasCherry;
}

}