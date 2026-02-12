import java.util.*;

public class SkipClass {
    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        System.out.println(obj);

        obj.stream()
                .skip(3)
                .forEach( i -> System.out.println(i));
    }

}
