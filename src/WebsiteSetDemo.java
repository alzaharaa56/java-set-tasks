import java.util.HashSet;
import java.util.Set;

public class  WebsiteSetDemo {
public static void main(String[] args) {
Set<String> websites = new HashSet<>();

websites.add("Google");
websites.add("YouTube");
websites.add("GitHub");
websites.add("Amazon");
websites.add("LinkedIn");

System.out.println("Original Websites: " + websites);

websites.add("Google");
System.out.println("Set after duplicate test: " + websites);

System.out.println("Does 'GitHub' exist? " + websites.contains("GitHub"));
System.out.println("Does 'Facebook' exist? " + websites.contains("Facebook"));

websites.remove("Amazon");
System.out.println("Set after removing 'Amazon': " + websites);

System.out.println("Total websites: " + websites.size());

websites.add("StackOverflow");
System.out.println("Updated Set: " + websites);
System.out.println("New total count: " + websites.size());

websites.clear();
System.out.println("Set after clearing: " + websites);

System.out.println("Final size: " + websites.size());
if (websites.isEmpty()) {
System.out.println("The website set now contains zero elements.");
}
}
}
