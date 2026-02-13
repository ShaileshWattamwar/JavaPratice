import java.util.HashSet;
import java.util.Set;

public class Example8 {
    public static void main(String[] args) {
        Set<Integer> i=new HashSet<>();
        i.add(21);
        i.add(6);
        i.add(43);
        i.add(23);
        i.add(4);
        long count=i.stream().filter(n->n>10)
                .count();
        System.out.println("count is  "+count);
    }
}
