import java.util.Arrays;

public class Inventory {

  // Buat array Product dan atribut size
  private Product[] products;
  private int size;

  // Buat constructor Inventory untuk set panjang kapasitas product, dan set size = 0
  public Inventory(int capacity) {
    this.products = new Product[capacity];
    this.size = 0;
  }

  // Buat method void addProduct untuk menambahkan data ke array products, dan buat percabangan untuk mengukur apabila kapasitas penuh maka tidak bisa menambahkan data lagi dan muncul kalimat "Inventory is full. Cannot add more products."
  public void addProduct() {
    if (size < products.length) {
      Product newProduct = new Product();
      products[size] = newProduct;
      size++;
    } else {
      System.out.println("Inventory is full. Cannot add more products.");
    }
  }

  // Buat method displayProducts untuk menampilkan semua data product
  public void displayAllProducts() {
    for (int i = 0; i < size; i++) {
      System.out.println(
        "Product Name: " +
        products[i].getName() +
        ", Price: " +
        products[i].getPrice() +
        ", Stock: " +
        products[i].getStock()
      );
    }
  }

  // Buat method deleteProductByName untuk menghapus data
  public void deleteProductByName(String productName) {
    for (int i = 0; i < size; i++) {
      if (products[i].getName().equals(productName)) {
        // Menghapus produk berdasarkan nama
        products[i] = null;

        // Geser elemen-elemen produk setelah penghapusan object
        for (int j = i; j < size - 1; j++) {
          products[j] = products[j + 1];
        }

        // Kurangi ukuran array object
        size--;
        break;
      }
    }
  }

  // Buat Finalizer untuk setiap produk yang tidak dihapus secara eksplisit
  @Override
  protected void finalize() throws Throwable {
    for (int i = 0; i < size; i++) {
      products[i].finalize();
    }
    super.finalize();
  }
}
