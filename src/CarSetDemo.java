import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
public static void main(String[] args) {
Set<String> carNames = new HashSet<>();

carNames.add("Toyota");
carNames.add("Honda");
carNames.add("BMW");
carNames.add("Audi,");
carNames.add("Nissan");

System.out.println("Current Car Names in Set: " + carNames);

carNames.add("Mercedes");
System.out.println("Set after adding one more: " + carNames);

carNames.add("Toyota");
System.out.println("Set after attempting to add duplicate 'Toyota': " + carNames);

System.out.println("Does 'BMW' exist in the set? " + carNames.contains("BMW"));
System.out.println("Does 'Ford' exist in the set? " + carNames.contains("Ford"));

carNames.remove("Audi,");
System.out.println("Set after removing 'Audi': " + carNames);

System.out.println("Total number of cars: " + carNames.size());

carNames.add("Lexus");
System.out.println("Updated Set with 'Lexus': " + carNames);
System.out.println("New total count: " + carNames.size());

carNames.clear();
System.out.println("Set after clearing it: " + carNames);

if (carNames.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
