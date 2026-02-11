public class CounterExample {
    static int count =0;

    static void increment() {
        count++;
    }
    public static void main(String [] args) {
        CounterExample.increment();
        CounterExample.increment();
        System.out.println("Count =" + CounterExample.count);


    }
}
