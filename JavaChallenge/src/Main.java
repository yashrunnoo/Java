public class Main {
    public static void main(String[] args) {
        Account yash = new Account();

        Account bob = new Account("111",23000.00,"Bob","bob.dsf@gmail.com","9901199011");

        yash.setBalance(10000);
        yash.withdraw(11000);
        yash.deposit(500);
        System.out.println(yash);

        System.out.println(bob.getAccountNo() + bob.getCustomerName() + bob.getBalance());
    }
}