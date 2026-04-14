import java.util.HashSet;
import java.util.Set;

public class  CourseSetDemo {
public static void main(String[] args) {
Set<String> trainingCourses = new HashSet<>();

trainingCourses.add("Java Programming");
trainingCourses.add("Web Development");
trainingCourses.add("Data Analysis");
trainingCourses.add("UI/UX Design");
trainingCourses.add("Cyber Security");

System.out.println("Original Training Courses: " + trainingCourses);

trainingCourses.add("Java Programming");
System.out.println("Set after duplicate test: " + trainingCourses);

System.out.println("Does 'Web Development' exist? " + trainingCourses.contains("Web Development"));
System.out.println("Does 'Mobile App Dev' exist? " + trainingCourses.contains("Mobile App Dev"));
trainingCourses.remove("Data Analysis");
System.out.println("Set after removing 'Data Analysis': " + trainingCourses);

System.out.println("Total courses: " + trainingCourses.size());

trainingCourses.add("Cloud Computing");
System.out.println("Updated Set: " + trainingCourses);
System.out.println("New total count: " + trainingCourses.size());

trainingCourses.clear();
System.out.println("Set after clearing: " + trainingCourses);

System.out.println("Final size: " + trainingCourses.size());
if (trainingCourses.isEmpty()) {
System.out.println("The training course set now contains zero elements.");
}
}
}
