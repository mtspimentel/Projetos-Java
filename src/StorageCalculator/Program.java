package StorageCalculator;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product Data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
