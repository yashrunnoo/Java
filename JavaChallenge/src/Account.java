public class Account {
    private String accountNo = "";
    private double balance = 0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    //constructor
    public Account(){
        System.out.println("no args cons called");
    }
    public Account(String accountNo, double balance, String customerName, String email, String phoneNumber){
        this.accountNo = accountNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with args called");
    }

    //Setters
    public void setAccountNo(String accountNo){
        this.accountNo= accountNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String custName){
        customerName = custName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getAccountNo()
    {
        return accountNo;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void deposit(double amountToDeposit){
        System.out.println("Balance before deposit : " + balance);
        balance += amountToDeposit;
        System.out.println("Balance after deposit : " + balance);
    }
    public void withdraw(double amountToWithdraw){
        if ((balance - amountToWithdraw) < 0)
        {
            System.out.println("Withdrawal not possible bitch !!!");
            return;
        }
        System.out.println("Balance before Withdrawal : " + balance);
        balance -= amountToWithdraw;
//        System.out.println("Withdrawal Successful !");
        System.out.println("Balance after Withdrawal : " + balance);
    }
}
