import java.util.Comparator;
import java.util.List;

public class IntegerStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(
                1,2,3,4,5,
                5,10,15,20,25,
                10,20,30,40,50,
                100,200,300,400,500
        );

        numbers.stream().forEach(System.out::println);
        //printing all numbers
        System.out.println("-----------------------------------------");

        numbers.stream().distinct().forEach(System.out::println);
        //return unique value :: remove duplicate data
        System.out.println("-----------------------------------------");

        numbers.stream().map(n -> n*n).forEach(System.out::println);
        // return result square number
        System.out.println("-----------------------------------------");

        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
        //return result even numbers
        System.out.println("-----------------------------------------");

        numbers.stream().filter(n -> n%2 != 0).forEach(System.out::println);
        //return result odd numbers
        System.out.println("-----------------------------------------");

        numbers.stream().limit(5).forEach(System.out::println);
        //return first five numbers
        System.out.println("-----------------------------------------");

        numbers.stream().skip(5).forEach(System.out::println);
        //skip first five numbers
        System.out.println("-----------------------------------------");

        numbers.stream().sorted().forEach(System.out::println);
        // return ascending number
        System.out.println("-----------------------------------------");


        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // result = decending numbers
        System.out.println("-----------------------------------------");

        numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        //return top three numbers
        System.out.println("-----------------------------------------");

        numbers.stream().sorted(Comparator.reverseOrder()).skip(5).forEach(System.out::println);
        //top 5 numbers remove
        System.out.println("-----------------------------------------");

        long count = numbers.stream().count();
        System.out.println(" count total number :" + count);
        //return total count number
        System.out.println("-----------------------------------------");


        long evenCount = numbers.stream().filter( n ->n%2 ==0).count();
        System.out.println( "count even number:" + evenCount);
        //count only even numbers
        System.out.println("-----------------------------------------");

        long oddCount = numbers.stream().filter( n -> n%2 != 0).count();
        System.out.println( " count odd number:" + oddCount);
        //count only odd number
        System.out.println("-----------------------------------------");

       numbers.stream().filter(n -> n > 20).forEach(System.out::println);
       //20 greater than value show
        System.out.println("-----------------------------------------");

    }
}
