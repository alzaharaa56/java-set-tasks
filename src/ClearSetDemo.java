import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();


        cities.add("Muscat");
        cities.add("Salalah");
        cities.add("Sohar");
        cities.add("Nizwa");
        cities.add("Sur");


        System.out.println("Cities before clear: " + cities);
        System.out.println("Size before clear: " + cities.size());

        cities.clear();

        System.out.println("Cities after clear: " + cities);


        System.out.println("Size after clear: " + cities.size());

        if (cities.isEmpty()) {
            System.out.println("The set is now empty. Success!");

        }
    }
}
