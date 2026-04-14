import java.util.HashSet;
import java.util.Set;

public class AppSetDemo {
public static void main(String[] args) {
Set<String> mobileApps = new HashSet<>();

mobileApps.add("WhatsApp");
mobileApps.add("Instagram");
mobileApps.add("Snapchat");
mobileApps.add("TikTok");
mobileApps.add("YouTube");

System.out.println("Original Mobile Apps: " + mobileApps);

mobileApps.add("WhatsApp");
System.out.println("Set after duplicate test: " + mobileApps);

System.out.println("Does 'Instagram' exist? " + mobileApps.contains("Instagram"));
System.out.println("Does 'Facebook' exist? " + mobileApps.contains("Facebook"));

mobileApps.remove("TikTok");
System.out.println("Set after removing 'TikTok': " + mobileApps);

System.out.println("Total apps: " + mobileApps.size());

mobileApps.add("Telegram");
System.out.println("Updated Set: " + mobileApps);
System.out.println("New total count: " + mobileApps.size());
mobileApps.clear();
System.out.println("Set after clearing: " + mobileApps);
System.out.println("Final size: " + mobileApps.size());
if (mobileApps.isEmpty()) {
System.out.println("The mobile app set now contains zero elements.");
}
}
}
