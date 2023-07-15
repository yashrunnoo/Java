public class Main {
    public static void main(String[] args) {
//        String date = "02/03/2012";
//        System.out.println(date.substring(6));
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

//        Employee joe = new Employee("Joe", "11/11/1990","03/03/2020");
//        System.out.println(joe);

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990","03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension Check = $" + joe.collectPay());
    }
}
