import java.util.Scanner;

public class Product {

  // Buat atribut productName, price, dan stock dengan modifier private
  private String productName;
  private double price;
  private int stock;

  // Buat constructor Product
  public Product() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter product name: ");
    this.productName = scanner.nextLine();
    System.out.print("Enter product price: ");
    this.price = scanner.nextDouble();
    System.out.print("Enter product stock: ");
    this.stock = scanner.nextInt();
  }

  // Buat Finalizer untuk menampilkan pesan saat produk dihapus
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Product " + productName + " has been deleted.");
    super.finalize();
  }

  // Buat method getter
  public String getName() {
    return productName;
  }

  public double getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }
}
