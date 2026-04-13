import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
public static void main(String[] args) {

Set<String> productCodes = new HashSet<>();
productCodes.add("P001");
productCodes.add("P002");
productCodes.add("P003");
productCodes.add("P004");
productCodes.add("P005");



System.out.println("Product Codes: " + productCodes);



productCodes.add("P006");
System.out.println("Updated Product Codes: " + productCodes);
}
}
