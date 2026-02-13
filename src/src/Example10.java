import java.util.ArrayList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<String> v=new ArrayList<>();
        v.add("hello");
        v.add("i");
        v.add("am");
        v.add("dnyanu");
        v.add("coder");
        v.add("hello");
        v.add("i");
        v.add("am");
        v.add("dnyanu");
        v.add("coder");
        v.stream().distinct().forEach(b-> System.out.println(b)); //it will only print unique values
    }
}
