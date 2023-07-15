public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    //getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    //constructors
    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("default_Name","default_email"); // chains 2 constructor
    }

    public Customer(String name, String email){
        this(name,199.00,email); // chains 1 constructor
    }

    @Override
    public String toString() {
        return name + " " + email + " " + creditLimit + "\n";
    }
}

class Main{
    public static void main(String[] args) {
        Customer james = new Customer();
        Customer yash = new Customer("yash",2,"yash.runs@gmail.com");
        Customer jojo = new Customer("Jojo","jojomailbitchh");

        System.out.println(james);
        System.out.println(yash);
        System.out.println(jojo);
    }
}
