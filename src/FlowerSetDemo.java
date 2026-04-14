import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
public static void main(String[] args) {
Set<String> flowerNames = new HashSet<>();

flowerNames.add("Rose");
flowerNames.add("Lily");
flowerNames.add("Tulip");
flowerNames.add("Daisy");
flowerNames.add("Sunflower");

System.out.println("Original Flower Set: " + flowerNames);

flowerNames.add("Orchid");
System.out.println("Set after adding one more: " + flowerNames);

flowerNames.add("Rose");
System.out.println("Set after attempting to add duplicate 'Rose': " + flowerNames);

System.out.println("Does 'Lily' exist? " + flowerNames.contains("Lily"));
System.out.println("Does 'Jasmine' exist? " + flowerNames.contains("Jasmine"));

flowerNames.remove("Daisy");
System.out.println("Set after removing 'Daisy': " + flowerNames);

System.out.println("Total number of flowers: " + flowerNames.size());

flowerNames.add("Lavender");
System.out.println("Updated Set: " + flowerNames);
System.out.println("New total number of elements: " + flowerNames.size());

flowerNames.clear();
System.out.println("Set after clearing: " + flowerNames);

System.out.println("Final size: " + flowerNames.size());
if (flowerNames.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
