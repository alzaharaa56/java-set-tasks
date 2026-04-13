import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
public static void main(String[] args) {

Set<String> departments = new HashSet<>();
departments.add("IT");
departments.add("HR");
departments.add("Finance");
departments.add("Marketing");
departments.add("Sales");

System.out.println("Current Departments: " + departments);
                int initialSize = departments.size();
System.out.println("Total number of departments: " +initialSize);
               departments.add("Operations");

System.out.println("After adding one more, total departments: " + departments.size());

}
}
