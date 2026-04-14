import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {
public static void main(String[] args) {
Set<String> fruitNames = new HashSet<>();

fruitNames.add("Apple");
fruitNames.add("Banana");
fruitNames.add("Orange");
fruitNames.add("Mango");
fruitNames.add("Grapes");

System.out.println("Original Fruit Set: " + fruitNames);

fruitNames.add("Strawberry");
System.out.println("Set after adding one more: " + fruitNames);

fruitNames.add("Apple");
System.out.println("Set after attempting to add duplicate 'Apple': " + fruitNames);

System.out.println("Does 'Mango' exist? " + fruitNames.contains("Mango"));
System.out.println("Does 'Watermelon' exist? " + fruitNames.contains("Watermelon"));

fruitNames.remove("Orange");
System.out.println("Set after removing 'Orange': " + fruitNames);

System.out.println("Total number of fruits: " + fruitNames.size());

fruitNames.add("Pineapple");
System.out.println("Updated Set: " + fruitNames);
System.out.println("New total number of elements: " + fruitNames.size());

fruitNames.clear();
System.out.println("Set after clearing: " + fruitNames);

System.out.println("Final size: " + fruitNames.size());
if (fruitNames.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
