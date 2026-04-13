import java.util.HashSet;
import java.util.Set;

public class CheckSetDemo {
public static void main(String[] args) {

Set<Integer> employeeIds = new HashSet<>();

employeeIds.add(1001);
employeeIds.add(1002);
employeeIds.add(1003);
employeeIds.add(1004);
employeeIds.add(1005);

System.out.println("Current Employee IDs: ");
               int searchId1 = 1003;
boolean exists = employeeIds.contains(searchId1);
System.out.println("Does Employee ID " + searchId1 + " exist? " + exists);

int searchId2 = 2000;
boolean notExists = employeeIds.contains(searchId2);
System.out.println("Does Employee ID " + searchId2 + " exist? " + notExists);



}
}
