package Dnyanucoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("amit");
        names.add("sonu");
        names.add("arun");
        names.add("ram");
        names.add("sonu");
        names.add("jaysh");
        names.add("swaraj");
        names.add("apurva");
        names.add("sandesha");
        List<String> LimtedNames=names.stream().limit(5).toList();
        System.out.println("First five elements"+LimtedNames);
        List<String> SkipingNames=names.stream().skip(3).toList();
        System.out.println("after skiping"+SkipingNames);
        Long count=names.stream().count();
        System.out.println("Count of names "+count);
       boolean matchnames=names.stream().anyMatch(n->n.equals("sonu"));
        System.out.println("Match of given name " +matchnames);
        Optional<String> firstElement=names.stream().findFirst();
        System.out.println("the first element is "+firstElement);
        boolean allMatches=names.stream().allMatch(n->n.equals("amit"));
        System.out.println("The given length is "+allMatches);
       List<String> filteringNames=names.stream().filter(s->s.startsWith("s")).toList();
        System.out.println("filterd names "+filteringNames);
        List<String> uniqueNames=names.stream().distinct().toList();
        System.out.println("Unique names "+uniqueNames);
    }
}
