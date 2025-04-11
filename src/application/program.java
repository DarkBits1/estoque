package application;
import java.util.Scanner;
import entities.products;
import java.util.Locale;
public class program {
	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     products product = new products();
     
     System.out.println("Enter the product data: ");
     System.out.print("Name: ");
     product.name = sc.nextLine();
     System.out.print("Price: ");
     product.price = sc.nextDouble();
     System.out.print("Quantity in stock: ");
     product.quantity = sc.nextInt();
     
     System.out.println(product.toString());    
     
     System.out.print("Enter the number of products to be add in stock: ");
     int quantity = sc.nextInt();
     product.addProducts(quantity);
     System.out.println("Updated data:");
     
     System.out.println(product.toString());
     
     System.out.println("Enter the number of products to be removed from stock: ");
     
     quantity = sc.nextInt();
     
     product.removeProducts(quantity);
     
     System.out.println("Updated data:");
     
     System.out.println(product.toString());
     
     
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     sc.close();
}}
