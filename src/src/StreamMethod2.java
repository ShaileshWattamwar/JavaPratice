import java.util.ArrayList;
import java.util.List;


public class StreamMethod2 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(55);
        obj.add(43);
        obj.add(60);
        obj.add(71);
        obj.stream().filter(n -> n%2 !=0)
                .forEach( n -> System.out.println(n));
    }
}
