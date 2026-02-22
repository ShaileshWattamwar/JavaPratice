package StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays. asList(2,3,5,10,12,15
                ,19,29,30,45,56,33
                ,35,2,3,4,5,
                10,200,100,20,34);

        num.stream().forEach(System.out::println);
        System.out.println("---------------------");

        num.stream().distinct().forEach(System.out::println);
        System.out.println("----------------------");

        num.stream().sorted().forEach(System.out::println);
        System.out.println("---------------------");

        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("---------------------");

        num.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        System.out.println("------------------------");

        num.stream().map(n->n*n).forEach(System.out::println);
        System.out.println("---------------------");

        num.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println("---------------------");

        num.stream().filter(n->n%2!=0).forEach(System.out::println);
        System.out.println("---------------------");

        long numbersEven= num.stream().filter(n->n%2==0).count();
        System.out.println("Even Numbers="+numbersEven);

        long numbersOddCount= num.stream().filter(n->n%2!=0).count();
        System.out.println("Odd Numbers="+numbersOddCount);





    }
}
