interface test {
    int m1 (int a , int b);
}

public class Demo1 {
    public static void main(String[] args) {
        test obj = (a,b) -> a + b;
        System.out.println(obj.m1(3,7));


    }
}
