import java.util.HashSet;
import java.util.Set;

public class  ClearSetDemo {
public static void main(String[] args) {

Set<String> tempUsers = new HashSet<>();



tempUsers.add("User_01");
tempUsers.add("User_02");
tempUsers.add("User_03");
tempUsers.add("User_04");
tempUsers.add("User_05");



System.out.println("Original Temporary Users: " + tempUsers);



System.out.println("\n--- Testing Duplicates ---");
boolean isAdded = tempUsers.add("User_01");

System.out.println("Was 'User_01' added again? " + isAdded);
System.out.println("Current Set after duplicate test: " + tempUsers);
System.out.println("\n--- Checking Existence ---");
System.out.println("Does 'User_03' exist? " + tempUsers.contains("User_03"));
System.out.println("Does 'Guest_99' exist? " + tempUsers.contains("Guest_99"));



System.out.println("\n--- Removing Temporary User ---");
tempUsers.remove("User_05");

System.out.println("Set after removing 'User_05': " + tempUsers);



System.out.println("\n--- Checking Size ---");
System.out.println("Total temporary users: " + tempUsers.size());



tempUsers.add("User_06");

System.out.println("Updated Set with 'User_06': " + tempUsers);
System.out.println("New total count: " + tempUsers.size());



System.out.println("\n--- Clearing the Set ---");
tempUsers.clear();

System.out.println("Set after clearing: " + tempUsers);



if (tempUsers.isEmpty() && tempUsers.size() == 0) {
System.out.println("Final Confirmation: All temporary users have been cleared (Size: 0).");
}



}
}
