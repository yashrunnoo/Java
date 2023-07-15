public class Account {
    private String accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructor
    public Account(){
        //constructor chaining
        this("12121212",25.,"default name","default email","default phone number");
        System.out.println("Empty constructor Called");
    }
    public Account(String number , double balance, String customerName, String email, String phone)
    {
        System.out.println("Account constructor with parameters called");
        this.balance = balance;
        this.accountNo = number;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }
    //Below constructor generated using generate code
    public Account(String customerName, String email, String phoneNumber) {
        this("99999",100.55,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getAccountNo(){
        return accountNo;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Setters
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName1) {
        customerName = customerName1;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double amount){
        this.balance = this.balance + amount;
        System.out.println("Balance after deposit = " + this.balance);
    }

    public void withdrawFunds(double amount){
        if((this.balance - amount) < 0) {
            System.out.println("Withdrawal amount exceeds balance");
            return;
        }
        this.balance -= amount;
        System.out.println("Balance after withdrawal = " + this.balance);
    }

    public String describe()
    {
        String description = "Account no : "+accountNo + "\nBalance :  "+balance +"\nCustomer Name :  "+ customerName + "\nEmail : " + email + "\nphone no :  " +phoneNumber;
        return description;
    }
}
