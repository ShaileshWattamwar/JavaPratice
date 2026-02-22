package StreamPractice;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "mohan", "sita", "ravi", "ram" ,
                "giri","om","ronit","shri","sumit","shivam","avi","shri");

        names.stream().forEach(System.out::println);
        System.out.println("-----------------------");


        names.stream().distinct().forEach(System.out::println);
        System.out.println("----------------------");


        names.stream().map(n ->n.toUpperCase()).forEach(System.out::println);
        System.out.println("-----------------------");


        names.stream().map( n ->n.toLowerCase()).distinct().forEach(System.out::println);
        System.out.println("-----------------------");


        names.stream().map(n->n.toUpperCase()).limit(5).forEach(System.out::println);
        System.out.println("-----------------------");


        names.stream().map(n ->n.toUpperCase()).skip(5).distinct().forEach(System.out::println);
        System.out.println("-----------------------");


        names.stream().limit(1).forEach(System.out::println);
        System.out.println("-----------------------");


        Optional<String> findFir= names.stream().findFirst();
        System.out.println(findFir);
        System.out.println("-----------------------");


        Optional<String> Findany1=names.stream().findAny();
        System.out.println(Findany1);
        System.out.println("-----------------------");


        names.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        System.out.println("-----------------------");

        names.stream().allMatch(n ->n.length() >=2);
        System.out.println(names);
        System.out.println("--------------------------");


        names.stream().filter(n ->n.startsWith("s")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("---------------------------");

        long countsNumbers=names.stream().count();
        System.out.println(countsNumbers);

         long count= names.stream().filter(n->n.startsWith("s")).count();
        System.out.println(count);









    }
}
