import java.util.*;
import java.util.stream.Collectors;

public class StringStreamExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of(
                "giri","vaibhav","samruddhi","omkant","ronit","vaidehi"
                ,"sumit", "dnyanu","sneha","ronit","omkant","ram","vaibhav","sumit","bhumika"

        ));

        List<String> allData = names.stream().toList();
        // all data printed
        System.out.println(" all names printed :" + allData);
        System.out.println("-----------------------------------------");

        List<String> duplicateRemove = names.stream().distinct().toList();
        //duplicate names removed
        System.out.println( " duplicate names removed:" + duplicateRemove);
        System.out.println("-----------------------------------------");

        List<String> sorting = names.stream().sorted().toList();
        //all data print in sorting order
        System.out.println("return nams ascending order:" + sorting);
        System.out.println("-----------------------------------------");

        List<String> uniqueAndSorted = names.stream().sorted().distinct().toList();
        //all data print in sorting order and unique data return
        System.out.println( " unique and ascending order :" + uniqueAndSorted);
        System.out.println("-----------------------------------------");

        List<String> firstSixNames = names.stream().limit(6).toList();
        //only first 6 names printed
        System.out.println(" first 6 names:" + firstSixNames);
        System.out.println("-----------------------------------------");

        List<String> firstSixRemoved = names.stream().skip(6).distinct().toList();
        //first 6 names are removed and remaining all names printed
        //and duplicate names are removed
        System.out.println("first six names without printed:" + firstSixRemoved);
        System.out.println("-----------------------------------------");

        List<String> allNamesCapital = names.stream().map(c ->c.toUpperCase()).distinct().toList();
        // all names printed in uppercase and duplicate data removed
        System.out.println("uppercase names:"  + allNamesCapital);
        System.out.println("-----------------------------------------");

        List<String> reverseOrderNames = names.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        //all data in reverse order and duplicate names are removed
        System.out.println("reverse order:" + reverseOrderNames);
        System.out.println("-----------------------------------------");

        List<String> namesStartwith = names.stream().filter(s -> s.startsWith("s")).toList();
        // s names stared printed
        System.out.println( " s character names start :" + namesStartwith);
        System.out.println("-----------------------------------------");

        long nameStartWithCount = names.stream().filter(s ->s.startsWith("s")).count();
        //s names started count
        System.out.println("s character names count:" + nameStartWithCount);
        System.out.println("-----------------------------------------");

        Map<Integer , Long> countNamesWithCount = names.stream().collect(Collectors.groupingBy(String::length , Collectors.counting()));
        // doubt and very confusion
        System.out.println("Length count by name:" + countNamesWithCount);
        System.out.println("-----------------------------------------");

        long count = names.stream().count();
        //all names are count
        System.out.println("counting names:" + count);
        System.out.println("-----------------------------------------");

        List<String> findFirstName = names.stream().map(f->f.toUpperCase()).limit(1).toList();
        //retrun first name and name is uppercase
        System.out.println("first name return:" + findFirstName);
        System.out.println("-----------------------------------------");

        Optional<String> findFirst = names.stream().map(f->f.toUpperCase()).findFirst();
        // this method return optional data
        System.out.println(findFirst);
        System.out.println("-----------------------------------------");


































    }
}
