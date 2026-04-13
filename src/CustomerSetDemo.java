import java.util.HashSet;
import java.util.Set;

public class CustomerSetDemo {
public static void main(String[] args) {
Set<Integer> customerIds = new HashSet<>();



customerIds.add(101);
customerIds.add(102);
customerIds.add(103);
customerIds.add(104);
customerIds.add(105);

System.out.println("Before duplicate: " + customerIds);



customerIds.add(101);



System.out.println("After attempting duplicate: " + customerIds);
}
}
