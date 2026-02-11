import java.util.function.Function;

public class Funtion1 {
    public static void main(String[] args) {
        Function<Integer,Integer>cube=(n)->n*n*n;
        System.out.println(cube.apply(4));
    }
}
