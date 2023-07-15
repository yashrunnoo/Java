public class Main {
    //Car car = new Car();

    public static void main(String[] args) {
//        System.out.println("Hello");
        Car car = new Car();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        car.describeCar();
    }
}