import java.util.HashSet;
import java.util.Set;

public class  ProductSetDemos {
public static void main(String[] args) {
Set<String> products = new HashSet<>();

products.add("Laptop");
products.add("Smartphone");
products.add("Tablet");
products.add("Headphones");
products.add("Smartwatch");

System.out.println("Original Product Names: " + products);

products.add("Laptop");
System.out.println("Set after duplicate test: " + products);

System.out.println("Does 'Smartphone' exist? " + products.contains("Smartphone"));
System.out.println("Does 'Camera' exist? " + products.contains("Camera"));

products.remove("Tablet");
System.out.println("Set after removing 'Tablet': " + products);

System.out.println("Total products: " + products.size());

products.add("Monitor");
System.out.println("Updated Set: " + products);
System.out.println("New total count: " + products.size());

products.clear();
System.out.println("Set after clearing: " + products);

System.out.println("Final size: " + products.size());
if (products.isEmpty()) {
System.out.println("The product name set now contains zero elements.");
}
}
}
