import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
public static void main(String[] args) {

Set<String> cities = new HashSet<>();



cities.add("Muscat");
cities.add("Salalah");
cities.add("Sohar");
cities.add("Nizwa");
cities.add("Sur");



System.out.println("Original City Set: " + cities);


System.out.println("\n--- Testing Duplicates ---");
boolean isAdded = cities.add("Muscat");
System.out.println("Was 'Muscat' added again? " + isAdded);
System.out.println("Set after duplicate test: " + cities);



System.out.println("\n--- Checking Existence ---");
System.out.println("Does 'Salalah' exist? " + cities.contains("Salalah"));
System.out.println("Does 'Dubai' exist? " + cities.contains("Dubai"));


System.out.println("\n--- Removing City ---");
cities.remove("Sur");

System.out.println("Set after removing 'Sur': " + cities);



System.out.println("\n--- Checking Size ---");
System.out.println("Total cities currently: " + cities.size());



cities.add("Ibri");

System.out.println("Updated Set with 'Ibri': " + cities);
System.out.println("New total count: " + cities.size());


System.out.println("\n--- Clearing the Set ---");
cities.clear();

System.out.println("Set after clearing: " + cities);



if (cities.isEmpty() && cities.size() == 0) {
System.out.println("Final confirmation: The city set now contains zero elements.");
}



}
}




