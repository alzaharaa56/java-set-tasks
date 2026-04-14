import java.util.HashSet;
import java.util.Set;

public class CountrySetDemos {
public static void main(String[] args) {
Set<String> countries = new HashSet<>();

countries.add("Oman");
countries.add("Saudi Arabia");
countries.add("United Arab Emirates");
countries.add("Qatar");
countries.add("Kuwait");

System.out.println("Original Country Set: " + countries);

countries.add("Bahrain");
System.out.println("Set after adding one more: " + countries);

countries.add("Oman");
System.out.println("Set after attempting to add duplicate 'Oman': " + countries);

System.out.println("Does 'Qatar' exist? " + countries.contains("Qatar"));
System.out.println("Does 'Egypt' exist? " + countries.contains("Egypt"));

countries.remove("Kuwait");
System.out.println("Set after removing 'Kuwait': " + countries);

System.out.println("Total number of countries: " + countries.size());

countries.add("Jordan");
System.out.println("Updated Set: " + countries);
System.out.println("New total number of elements: " + countries.size());

countries.clear();
System.out.println("Set after clearing: " + countries);

System.out.println("Final size: " + countries.size());
if (countries.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
