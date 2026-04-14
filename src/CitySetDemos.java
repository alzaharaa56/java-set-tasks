import java.util.HashSet;
import java.util.Set;

public class CitySetDemos {
public static void main(String[] args) {
Set<String> cities = new HashSet<>();

cities.add("Muscat");
cities.add("Salalah");
cities.add("Sohar");
cities.add("Nizwa");
cities.add("Sur");

System.out.println("Original City Set: " + cities);

cities.add("Ibri");
System.out.println("Set after adding one more city: " + cities);

cities.add("Muscat");
System.out.println("Set after attempting to add duplicate 'Muscat': " + cities);

System.out.println("Does 'Salalah' exist? " + cities.contains("Salalah"));
System.out.println("Does 'Dubai' exist? " + cities.contains("Dubai"));

cities.remove("Sur");
System.out.println("Set after removing 'Sur': " + cities);

System.out.println("Total number of cities: " + cities.size());

cities.add("Rustaq");
System.out.println("Updated Set: " + cities);
System.out.println("New total number of elements: " + cities.size());

cities.clear();
System.out.println("Set after clearing: " + cities);

System.out.println("Final size: " + cities.size());
if (cities.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
