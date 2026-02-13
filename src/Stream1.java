
import java.util.*;
import java.util.stream.*;

    public class Stream1 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

            numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(i -> System.out.println(i));
        }
    }


