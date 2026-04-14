import java.util.HashSet;
import java.util.Set;

public class CourseSetDemos {
public static void main(String[] args) {
Set<String> courses = new HashSet<>();

courses.add("Java");
courses.add("Python");
courses.add("Database");
courses.add("Networking");
courses.add("Web Design");

System.out.println("Original Course Set: " + courses);

courses.add("Digital Marketing");
System.out.println("Set after adding one more: " + courses);

courses.add("Java");
System.out.println("Set after attempting to add duplicate 'Java': " + courses);

System.out.println("Does 'Python' exist? " + courses.contains("Python"));
System.out.println("Does 'C++' exist? " + courses.contains("C++"));

courses.remove("Networking");
System.out.println("Set after removing 'Networking': " + courses);

System.out.println("Total number of courses: " + courses.size());

courses.add("Cloud Computing");
System.out.println("Updated Set: " + courses);
System.out.println("New total number of elements: " + courses.size());

courses.clear();
System.out.println("Set after clearing: " + courses);

System.out.println("Final size: " + courses.size());
if (courses.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
