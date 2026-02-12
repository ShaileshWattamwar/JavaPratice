import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example9 {
    public static void main(String[] args) {
        List <Integer> a=new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(23);
        a.add(34);
        a.add(45);
        int b=a.stream().max(Integer::compare)
                .get();
        System.out.println(b);

    }
}
