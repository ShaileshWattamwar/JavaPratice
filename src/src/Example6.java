import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.stream().filter(n-> n%2==0)
        .forEach(n-> System.out.println(n+"  "));

    }
}
