package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(
                10,15,24,22,20,
                25,33,30,40,22,30,20,22,
                88,90,92,93,95,98,22
        );

        list.stream().forEach(System.out::println);
        System.out.println("--------------------");

        list.stream().filter(n->n>=25).forEach(System.out::println);
        System.out.println("--------------------");

        list.stream().distinct().forEach(System.out::println);
        System.out.println("--------------------");

        long c= list.stream().count();
        System.out.println(c);
        System.out.println("--------------------");


        list.stream().map(n->n*2).forEach(System.out::println);
        System.out.println("--------------------");

        list.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------");

        list.stream().sorted((a,b)->b-a).forEach(System.out::println);
        System.out.println("--------------------");

        int max= list.stream().max(Integer::compare).get();
        System.out.println(max);
        System.out.println("--------------------");

        int min= list.stream().min(Integer::compare).get();
        System.out.println(min);
        System.out.println("--------------------");

        System.out.println(list.stream().anyMatch(n->n  >50));
        System.out.println("--------------------");

        System.out.println(list.stream().allMatch(n->n >2));
        System.out.println("--------------------");

        System.out.println(list.stream().noneMatch(n->n <0));
        System.out.println("--------------------");


    }
}
