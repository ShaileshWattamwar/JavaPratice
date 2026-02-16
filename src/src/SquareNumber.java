import java.util.*;

public class SquareNumber {
    public static void main(String[] args) {

        List<Integer> squareNum = new ArrayList<>();

        squareNum.add(10);
        squareNum.add(20);
        squareNum.add(50);
        squareNum.add(100);
        squareNum.add(40);

        squareNum.stream().map(n -> n*n)
                .forEach( n -> System.out.println("square number:" + n));

    }
}
