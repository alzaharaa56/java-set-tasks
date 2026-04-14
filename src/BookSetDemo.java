import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
public static void main(String[] args) {
Set<String> bookTitles = new HashSet<>();

bookTitles.add("The Great Gatsby");
bookTitles.add("1984");
bookTitles.add("To Kill a Mockingbird");
bookTitles.add("The Catcher in the Rye");
bookTitles.add("Brave New World");

System.out.println("Original Book Titles: " + bookTitles);

bookTitles.add("1984");
System.out.println("Set after duplicate test: " + bookTitles);

System.out.println("Does '1984' exist? " + bookTitles.contains("1984"));
System.out.println("Does 'Hamlet' exist? " + bookTitles.contains("Hamlet"));

bookTitles.remove("Brave New World");
System.out.println("Set after removing 'Brave New World': " + bookTitles);

System.out.println("Total books: " + bookTitles.size());

bookTitles.add("The Hobbit");
System.out.println("Updated Set: " + bookTitles);
System.out.println("New total count: " + bookTitles.size());

bookTitles.clear();
System.out.println("Set after clearing: " + bookTitles);

System.out.println("Final size: " + bookTitles.size());
if (bookTitles.isEmpty()) {
System.out.println("The book title set now contains zero elements.");
}
}
}
