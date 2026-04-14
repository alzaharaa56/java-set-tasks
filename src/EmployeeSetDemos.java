import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemos {
public static void main(String[] args) {
Set<String> employees = new HashSet<>();

employees.add("Ali");
employees.add("Sara");
employees.add("Omar");
employees.add("Noor");
employees.add("Maha");

System.out.println("Original Employee Set: " + employees);

employees.add("saleh");
System.out.println("Set after adding one more: " + employees);

employees.add("Ali");
System.out.println("Set after attempting to add duplicate 'Ali': " + employees);

System.out.println("Does 'Sara' exist? " + employees.contains("Sara"));
System.out.println("Does 'Khalid' exist? " + employees.contains("Khalid"));

employees.remove("Omar");
System.out.println("Set after removing 'Omar': " + employees);

System.out.println("Total number of employees: " + employees.size());

employees.add("Hassan");
System.out.println("Updated Set: " + employees);
System.out.println("New total number of elements: " + employees.size());

employees.clear();
System.out.println("Set after clearing: " + employees);

System.out.println("Final size: " + employees.size());
if (employees.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
