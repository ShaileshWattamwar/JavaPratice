import java.util.ArrayList;
import java.util.List;

public class StreamMethod3 {
    public static void main(String[] args) {

        List<String> obj =  new ArrayList<>();
        obj.add("hello");
        obj.add("good");
        obj.add("morning");

        obj.stream().map(s ->s.toUpperCase())
                .forEach(s -> System.out.println("convert upper case:" + s));

        System.out.println("-------------------------------------------");
        
        List<Integer> cubeNumber = new ArrayList<>();
        cubeNumber.add(10);
        cubeNumber.add(60);
        cubeNumber.add(25);
        cubeNumber.add(50);
        
        cubeNumber.stream().map(i ->i*i*i)
                .forEach(n -> System.out.println("cube is :" + n));

    }
}
