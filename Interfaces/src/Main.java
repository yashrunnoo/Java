public class Main {
    public static void main(String[] args) {
        FlightEnabled flier;
        Bird bird = new Bird();
        Animal animal = bird;
        flier = bird;
        //Trackable tracked = bird;

        animal.move();

        flier.takeOff();
        flier.fly();
        //tracked.track();
        flier.land();

        inFlight(flier);

    }
    private static void inFlight(FlightEnabled flier){
        if(flier instanceof Trackable tracked){
            tracked.track();
            System.out.println("iuohiouyh");
        }
        flier.land();
    }
}
