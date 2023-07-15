public class Main {
    public static void main(String[] args) {
//        Account acc = new Account();
//        //{
//            acc.setAccountNo("123456");
//            acc.setBalance(10000);
//            acc.setCustomerName("Yash");
//            acc.setEmail("yash.runs@gmail.com");
//            acc.setPhoneNumber("9901455094");
//        //}
//
//        System.out.println(acc.describe());
//        acc.withdrawFunds(101);
//        acc.depositFunds(5);
//        System.out.println(acc.describe());


        Account  myAccount = new Account("12345",1000,"Yash","yash.runs@gmail.com","9901455094");
        System.out.println(myAccount.describe());
        myAccount.withdrawFunds(101);
        myAccount.depositFunds(5);
        System.out.println(myAccount.describe());

        System.out.println("\n\n\n");
        Account myAccount2 = new Account();
        System.out.println(myAccount2.describe());


        System.out.println("\n");
        //3 parameter constructor
        Account timsAccount = new Account("Tim", "tim@email.com","12345");
        System.out.println("AccountNo : " + timsAccount.getAccountNo() + "name : " + timsAccount.getCustomerName());
    }
}
//    private String accountNo;
//    private double balance;
//    private String customerName;
//    private String email;
//    private int phoneNumber;