import java.util.ArrayList;
import java.util.Scanner;
//LAB SHOPING CART
//-----------------------------------------------------code with uttam kumar---------------------------------------------------------------
class Product {
    int id;
    String title;
    double price;
    int qty;
}

public class Billingjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> items = new ArrayList<>();

        int ch;
        while (true) {
            System.out.println("\n1. Add item\n2. Delete item\n3. View items\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    Product p = new Product();

                    
                    System.out.print("ID: ");
                    p.id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    p.title = sc.nextLine();

                    System.out.print("Price: ");
                    p.price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    p.qty = sc.nextInt();

                    items.add(p);
                    System.out.println("Product " + p.title + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).id == delId) {
                            items.remove(i);
                            found = true;
                            System.out.println("Product deleted successfully!");
                            break;
                        }
                    }
                    if (!found) System.out.println("Product not found!");
                    break;

                case 3:
                    if (items.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        double totalprice = 0;
                        for (Product prod : items) {
                            System.out.println("ID: " + prod.id +
                                               ", Title: " + prod.title +
                                               ", Price: " + prod.price +
                                               ", Qty: " + prod.qty);
                            totalprice += prod.price * prod.qty;
                        }
                        System.out.println("Total Shopping Cart Value: INR " + totalprice);
                    }
                    break;

                case 4:
                    System.out.println("Program completed successfully.");
                    sc.close();
                    return;

                default:
                System.out.println("Invalid choice!");
            }
        }
    }
}
