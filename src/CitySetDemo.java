import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
public static void main(String[] args) {

Set<String> colors = new HashSet<>();



colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Black");
colors.add("Yellow");



System.out.println("Original Color Set: " + colors);



System.out.println("Testing Duplicates ");
boolean isAdded = colors.add("Red");

System.out.println("Was 'Red' added again? " + isAdded);
System.out.println("Set after duplicate test: " + colors);

System.out.println(" Checking Existence ");

System.out.println("Does 'Blue' exist? " + colors.contains("Blue"));

System.out.println("Does 'Purple' exist? " + colors.contains("Purple"));



System.out.println(" Removing Color ");
colors.remove("Black");

System.out.println("Set after removing 'Black': " + colors);



System.out.println(" Checking Size ");
System.out.println("Total number of colors: " + colors.size());

colors.add("Orange");
System.out.println("Updated Set with 'Orange': " + colors);

System.out.println("New total count: " + colors.size());



System.out.println(" Clearing the Set ");
colors.clear();

System.out.println("Set after clearing: " + colors);



System.out.println("Final size confirmation: " + colors.size());
if (colors.isEmpty()) {
System.out.println("Message: The color set now contains zero elements.");
}
}
}
