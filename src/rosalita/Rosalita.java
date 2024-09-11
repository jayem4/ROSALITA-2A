
package rosalita;

import java.util.ArrayList;
import java.util.Scanner;


public class Rosalita {

    
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
    
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of Products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Price per Unit: ");
            double pricePerUnit = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(id, name, category, stockQuantity, pricePerUnit);
            products.add(product);
        }

        System.out.println("\nID\tName\tCategory\tStock Quantity\tPrice per Unit\tStatus");

        for (Product product : products) {
            System.out.print(product.getId + "\t" + product.getName + "\t" + product.getCategory() + "\t" + product.getStockQuantity + "\t" + product.getPricePerUnit + "\t");

            if(product.isValid){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
       }
    }

    
    

        
    
    
}
