import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Create objects
    IceCream base = new IceCream("Strawberry", "Medium", 5.99);
    Sundaes sundae = new Sundaes("Chocolate", "Large", 8.49, "Sprinkles", true);
    Milkshake shake = new Milkshake("Vanilla", "Small", 6.25, "Extra Thick", false);

    // Print their info
    System.out.println("Base Ice Cream: " + base);
    System.out.println("Sundae: " + sundae);
    System.out.println("Milkshake: " + shake);

    input.close();
  }
}
