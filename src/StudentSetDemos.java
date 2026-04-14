import java.util.HashSet;
import java.util.Set;

public class StudentSetDemos {
public static void main(String[] args) {
Set<String> studentNames = new HashSet<>();

studentNames.add("Noor");
studentNames.add("Ahmed");
studentNames.add("Sara");
studentNames.add("Omar");
studentNames.add("Fatima");

System.out.println("Original Student Names: " + studentNames);

studentNames.add("Noor");
System.out.println("Set after duplicate test: " + studentNames);

System.out.println("Does 'Sara' exist? " + studentNames.contains("Sara"));
System.out.println("Does 'Khalid' exist? " + studentNames.contains("Khalid"));

studentNames.remove("Omar");
System.out.println("Set after removing 'Omar': " + studentNames);

System.out.println("Total student names: " + studentNames.size());

studentNames.add("Mona");
System.out.println("Updated Set: " + studentNames);
System.out.println("New total count: " + studentNames.size());

studentNames.clear();
System.out.println("Set after clearing: " + studentNames);

System.out.println("Final size: " + studentNames.size());
if (studentNames.isEmpty()) {
System.out.println("The student set now contains zero elements.");
}
}
}
