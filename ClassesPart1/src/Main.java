public class Main {
    public static void main(String args[]) {
        Car car = new Car();
//        car.make = "Porsche";
        car.setMake("Porsche");
//        car.model = "Carrera";
        car.setModel("Carrera");
//        car.color = "Red";
        car.setColor("Black");
        car.setConvertible(true);
        car.setDoors(2);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("targa");
        targa.setColor("red");
        targa.setConvertible(false);
        targa.setDoors(2);

        targa.describeCar();
    }

}