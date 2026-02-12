import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amit", "Rahul", "Ankit", "Neha", "Rohit", "Amit", "Rahul", "Ankit", "Neha",
                "Raj", "Anita", "Mohit", "Riya", "Aman","omkant","giriraj","dnyanu","sneha"
        );
        List<String> removeDuplicate = names.stream().distinct().toList();
        System.out.println("unique value :" + removeDuplicate);

        List<String> firstElement = names.stream().limit(5).toList();
        System.out.println("first five element:" + firstElement);

        List<String> skipElement = names.stream().skip(7).toList();
        System.out.println("after seven names:" + skipElement);

        long countNames = names.stream().count();
        System.out.println("count names:" + countNames);

        boolean findName = names.stream().anyMatch(isAvailable ->isAvailable.equals("Amit"));
        System.out.println("find name:"+ findName);

        Optional<String> findFirs = names.stream().findFirst();
        System.out.println("find first name :" + findFirs);

        boolean fourWordNames = names.stream().allMatch(a ->a.length()>=3);
        System.out.println("four Length names:" + fourWordNames);

        Optional<String>randomNames = names.stream().findAny();
        System.out.println("any name:" + randomNames);
        randomNames.ifPresent(n -> System.out.println("Any Name: " + n));
    }
}
