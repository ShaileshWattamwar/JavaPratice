import java.util.*;

public class SortedClass {
    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(10,9,8,7,6,5,4);
             obj.stream()
                     .sorted()
                     .forEach(System.out::println);
        System.out.println("------------------------------------------");

        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(300);
        obj1.add(500);
        obj1.add(800);
        obj1.add(400);
        System.out.println("arraylist:");
        obj1.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------------------");

       HashSet<Character> obj2 = new HashSet<>(Arrays.asList('q','o','p','g','b','m'));

       obj2.stream()
               .sorted()
               .forEach(System.out::println);

    }
}
