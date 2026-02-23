package Dnyanucoder;

import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

public class StramPractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(
                5, 12, 7, 20, 5, 30, 12, 45, 10, 25, 30, 2, 8
        );
        List<String> names = List.of(
                "Alice", "Bob", "Andrew", "Charlie", "David",
                "Alice", "Eve", "Oscar", "Uma", "Bob"
        );
        //Given a list of integers, return only the even numbers.
        List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).toList();
        System.out.println("the even numbers"+evenNumbers);
        //Given a list of strings, convert all strings to uppercase.
        List<String>toUpper=names.stream().map(n->n.toUpperCase()).toList();
        System.out.println("names in uppercase "+toUpper);
        //Given a list of integers, remove duplicate values.
        List<Integer>removeDuplicate=numbers.stream().distinct().toList();
        System.out.println("remove duplicat values "+removeDuplicate);
        //From a list of numbers, get the first 5 elements.
        List<Integer>firstFive=numbers.stream().limit(5).toList();
        System.out.println("first five elements are "+firstFive);
        //Skip the first 3 elements from a list of integers.
        List<Integer>skipElement=numbers.stream().skip(3).toList();
        System.out.println("Afeter skiping first three "+skipElement);
        //From a list of strings, return strings that start with a vowel.
        List<String> stratVowel=names.stream()
                .filter(n->{char c= Character.toLowerCase(n.charAt(0));return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';}).toList();
        System.out.println("names start with vowels "+stratVowel);
       // Given a list of integers, return their squares.
        List<Integer> squaresNumbers=numbers.stream().map(n->n*n).toList();
        System.out.println("The Square of numbers is "+squaresNumbers);
        //From a list of names, sort them in alphabetical order.
        List<String> order=names.stream().sorted().toList();
        System.out.println("names in alphabetical order "+order);
        //Given a list of integers, return the top 3 largest numbers.
        List<Integer> topThree=numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("top three elements are "+topThree);
       // From a list of strings, return unique values sorted by length.
        List<String> uniqueSorted=names.stream().distinct().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("unique sorted by length "+uniqueSorted
        );
    }
}
