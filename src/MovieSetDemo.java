import java.util.HashSet;
import java.util.Set;

public class  MovieSetDemo {
public static void main(String[] args) {
Set<String> movieNames = new HashSet<>();

movieNames.add("Inception");
movieNames.add("The Dark Knight");
movieNames.add("Interstellar");
movieNames.add("Titanic");
movieNames.add("Avatar");

System.out.println("Original Movie Names: " + movieNames);

movieNames.add("Inception");
System.out.println("Set after duplicate test: " + movieNames);

System.out.println("Does 'Interstellar' exist? " + movieNames.contains("Interstellar"));
System.out.println("Does 'The Matrix' exist? " + movieNames.contains("The Matrix"));

movieNames.remove("Titanic");
System.out.println("Set after removing 'Titanic': " + movieNames);

System.out.println("Total movies: " + movieNames.size());
movieNames.add("Gladiator");
System.out.println("Updated Set: " + movieNames);
System.out.println("New total count: " + movieNames.size());

movieNames.clear();
System.out.println("Set after clearing: " + movieNames);

System.out.println("Final size: " + movieNames.size());
if (movieNames.isEmpty()) {
System.out.println("The movie name set now contains zero elements.");
}
}
}
