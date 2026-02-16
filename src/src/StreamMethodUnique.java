import java.util.ArrayList;
import java.util.List;

public class StreamMethodUnique {
    public static void main(String[] args) {

        List<Integer> unique = new ArrayList<>();
        unique.add(11);
        unique.add(12);
        unique.add(13);
        unique.add(14);
        unique.add(15);
        unique.add(11);
        unique.add(12);
        unique.add(13);
        unique.add(14);
        unique.add(15);
        unique.add(11);

        unique.stream().distinct().forEach(i -> System.out.println("unique values :" + i));

    }
}
