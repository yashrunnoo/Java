public class Customer {
    private String name;
    private double limit;
    private String address;

    public Customer(String name, double limit, String address){
        System.out.println("Inside full constructor");
        this.name = name;
        this.limit = limit;
        this.address = address;
    }
    public Customer(){
        this("Nobody","nobody@nowhere.com");
    }
    public Customer(String name, String email){
        this(name,1000,email);
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getlimit(){
        return limit;
    }
}
