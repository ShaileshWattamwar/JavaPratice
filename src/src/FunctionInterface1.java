import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterface1 {
    public static void main(String[] args) {

            Consumer<String> obj = s -> System.out.println(s);
            obj.accept("this is function interface in consumer method");

            System.out.println("-------------------------------------");

            Predicate<Integer> obj1 = i -> i < 10 ;
            System.out.println(obj1.test(5));
            System.out.println(obj1.test(10));

            System.out.println("--------------------------------------");

            Function<Integer, Integer> obj2 = i -> i*2;
            System.out.println(obj2.apply(10));

            System.out.println("------------------------------------------");

            Supplier<Double> obj3 = () -> 99.99;
            System.out.println(obj3.get());
        }
    }


