public class IceCream {
  
  private String flavor;
  private String size;
  private double price;

/*
*
*/No argument constructor
  public IceCream(){
  this.flavor = "Vanilla";
  this.size = "Large";
  this.price = 7.99;
  }

/*
*
*/Parameritized Constructor
  public IceCream(String flavor, String size, double price){
    this.flavor=flavor;
    this.size=size;
    this.price=price;
  }

  /*
  *
  */Accessor Methods
  public String getFlavor(){
    return flavor;
  }

  public String getSize(){
    return size;
  }

  public double getPrice(){
    return price;
  }

  /*
  *
  */toString method
  public String toString() {
  return "Flavor: " + flavor + ", Size: " + size + ", Price: $" + price;
}

  //setMethods
   public void setFlavor(String flavor) {
  this.flavor = flavor;
}

public void setSize(String size) {
  this.size = size;
}

public void setPrice(double price) {
  this.price = price;
}

}