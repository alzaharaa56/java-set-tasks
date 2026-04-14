import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemos {
public static void main(String[] args) {
Set<String> subjects = new HashSet<>();

subjects.add("Math");
subjects.add("Science");
subjects.add("English");
subjects.add("History");
subjects.add("Computer");

System.out.println("Original Subject Set: " + subjects);

subjects.add("Geography");
System.out.println("Set after adding one more: " + subjects);

subjects.add("Math");
System.out.println("Set after attempting to add duplicate 'Math': " + subjects);

System.out.println("Does 'Science' exist? " + subjects.contains("Science"));
System.out.println("Does 'Art' exist? " + subjects.contains("Art"));

subjects.remove("History");
System.out.println("Set after removing 'History': " + subjects);

System.out.println("Total number of subjects: " + subjects.size());

subjects.add("Physics");
System.out.println("Updated Set: " + subjects);
System.out.println("New total number of elements: " + subjects.size());

subjects.clear();
System.out.println("Set after clearing: " + subjects);

System.out.println("Final size: " + subjects.size());
if (subjects.isEmpty()) {
System.out.println("The set now contains zero elements.");
}
}
}
