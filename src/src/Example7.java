import java.util.ArrayList;

public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("hello");
        s.add("i");
        s.add("am");
        s.add("dnyanu");
        s.add("coder");
        s.stream().map(n->n.toUpperCase())
                .forEach(n-> System.out.println(n+ " "));

    }
}
