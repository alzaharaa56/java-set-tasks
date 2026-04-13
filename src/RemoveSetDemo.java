import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
public static void main(String[] args) {

Set<String> products = new HashSet<>();
products.add("Laptop");
products.add("Smartphone");
products.add("Tablet");
products.add("Smartwatch");
products.add("Headphones");

System.out.println("Products before removal: " + products);

String discontinuedProduct = "Headphones";
products.remove(discontinuedProduct);

System.out.println("Products after removing " + discontinuedProduct + ": " + products);

}
}
