import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the capacity of the inventory: ");
    int capacity = scanner.nextInt();
    Inventory inventory = new Inventory(capacity);

    int choice;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Add Product");
      System.out.println("2. Display All Products");
      System.out.println("3. Delete Product by Name");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          // Menambahkan produk baru
          inventory.addProduct();
          break;
        case 2:
          // Menampilkan semua produk
          inventory.displayAllProducts();
          break;
        case 3:
          // Menghapus produk berdasarkan nama
          System.out.print("Enter product name to delete: ");
          scanner.nextLine(); // Membersihkan buffer
          String deleteProductName = scanner.nextLine();
          inventory.deleteProductByName(deleteProductName);
          break;
        case 4:
          System.out.println("Exiting program.");
          break;
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    } while (choice != 4);
  }
}
