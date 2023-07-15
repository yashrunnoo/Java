public class Main {
    public static void main(String[] args) {
        Customer yash = new Customer();
        Customer karan = new Customer("karan",333,"Caro");
        Customer atis = new Customer("atis","atis@italy.com");

        System.out.println("KARAN");
        System.out.println("Karan = " + "Limit : " + karan.getlimit() + "\tAddress : " + karan.getAddress() + "\tName : " +  karan.getName());


        System.out.println("YASH");
        System.out.println("Yash = " + "Limit : " + yash.getlimit() + "\tAddress : " + yash.getAddress() + "\tName : " +  yash.getName());

        System.out.println("Atis");
        System.out.println("Atis = " + "Limit : " + atis.getlimit() + "\tAddress : " + atis.getAddress() + "\tName : " +  atis.getName());
    }
}
