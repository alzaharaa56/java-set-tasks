import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
public static void main(String[] args) {

Set<String> subjects = new HashSet<>();



subjects.add("Mathematics");
subjects.add("Science");
subjects.add("English");
subjects.add("History");
subjects.add("Computer Science");



System.out.println("Original Subject Set: " + subjects);



System.out.println(" Testing Duplicates ");
subjects.add("Science");

System.out.println("Set after adding duplicate 'Science': " + subjects);



System.out.println(" Checking Existence ");
System.out.println("Does 'English' exist? " + subjects.contains("English"));
System.out.println("Does 'Art' exist? " + subjects.contains("Art"));



System.out.println("Removing Subject ");
subjects.remove("History");

System.out.println("Set after removing 'History': " + subjects);



System.out.println(" Checking Size ");
System.out.println("Total number of subjects: " + subjects.size());



System.out.println(" Clearing the Set ");
subjects.clear();

System.out.println("Set after clearing: " + subjects);

if (subjects.isEmpty() && subjects.size() == 0) {
System.out.println("Confirmation: The subject set is now completely empty (Size: 0).");
}
}
}
