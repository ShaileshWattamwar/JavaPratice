import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10,20,30,40,50,60,60,70,70,80,90,100,90,100
        );

        List<Integer> removeDuplicate = numbers.stream().distinct().toList();
        System.out.println("remove dulicate:" + removeDuplicate);

        List<Integer> firstFive = numbers.stream().limit(5).toList();
        System.out.println("first five element :" + firstFive);

        Optional findAny = numbers.stream().findAny();
        System.out.println("find any number :" + findAny);

        List<Integer> skipFive = numbers.stream().skip(5).toList();
        System.out.println("skip five element" + skipFive);

        long countNumbers = numbers.stream().count();
        System.out.println("count numbers" + countNumbers);

        boolean findNumbers = numbers.stream().anyMatch(n -> n ==20);
        System.out.println("find numbers:" + findNumbers);

        Optional findFirst = numbers.stream().findFirst();
        System.out.println(" find first number:" + findFirst);




    }
}
