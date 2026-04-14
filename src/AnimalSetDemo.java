import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
public static void main(String[] args) {
Set<String> animalNames = new HashSet<>();

animalNames.add("Lion");
animalNames.add("Tiger");
animalNames.add("Elephant");
animalNames.add("Giraffe");
animalNames.add("Zebra");

System.out.println("Original Animal Set: " + animalNames);

animalNames.add("Monkey");
System.out.println("Set after adding one more: " + animalNames);

animalNames.add("Lion");
System.out.println("Set after attempting to add duplicate 'Lion': " + animalNames);

System.out.println("Does 'Tiger' exist? " + animalNames.contains("Tiger"));
System.out.println("Does 'Panda' exist? " + animalNames.contains("Panda"));

animalNames.remove("Zebra");
System.out.println("Set after removing 'Zebra': " + animalNames);

System.out.println("Total number of animals: " + animalNames.size());

animalNames.add("Kangaroo");
System.out.println("Updated Set: " + animalNames);
System.out.println("New total number of elements: " + animalNames.size());

animalNames.clear();
System.out.println("Set after clearing: " + animalNames);

System.out.println("Final size: " + animalNames.size());
if (animalNames.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
