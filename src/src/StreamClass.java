import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amit", "Rahul", "Ankit", "Neha", "Rohit",
                "Raj", "Anita", "Mohit", "Riya", "Aman","omkant","giriraj","dnyanu","sneha"
        );
        // print filter names from d
        List<String> filteredNames = names.stream().filter(g ->g.startsWith("d")).collect(Collectors.toList());
        System.out.println("Names starting with A: " + filteredNames);

        List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("uppercase data :" + upperCase);

        List<String> sortedName = names.stream().sorted().toList();
        System.out.println("sorted names :"+ sortedName);


    }
}
