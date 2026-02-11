public class Bank {
    static double interestRate;

    static {
        interestRate = 10.0;

    }
    static double calculateInterest(double amount){
        return amount * interestRate / 100;
    }

    public static void main(String[] args) {
        double interest = Bank.calculateInterest(1000);
        System.out.println("Interest =" + interest);
    }
}
