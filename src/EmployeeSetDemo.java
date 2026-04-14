import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
public static void main(String[] args) {

Set<String> flowers = new HashSet<>();


flowers.add("Rose");
flowers.add("Tulip");
flowers.add("Lily");
flowers.add("Daisy");
flowers.add("Jasmine");



System.out.println("Original Flower Set: " + flowers);

System.out.println(" Testing Duplicates ");
flowers.add("Rose");

System.out.println("Set after adding duplicate 'Rose': " + flowers);

System.out.println(" Checking Existence ");
System.out.println("Does 'Tulip' exist? " + flowers.contains("Tulip"));
System.out.println("Does 'Orchid' exist? " + flowers.contains("Orchid"));

System.out.println(" Removing Element ");
flowers.remove("Daisy");

System.out.println("Set after removing 'Daisy': " + flowers);

System.out.println(" Checking Size ");
System.out.println("Total flowers currently: " + flowers.size());

flowers.add("Sunflower");
System.out.println("Updated Set with 'Sunflower': " + flowers);

System.out.println("New total count: " + flowers.size());

System.out.println(" Clearing the Set ");
flowers.clear();

System.out.println("Set after clearing: " + flowers);

System.out.println("Final size confirmation: " + flowers.size());
if (flowers.isEmpty()) {
System.out.println("Message: The flower set now contains zero elements.");
}
}
}
