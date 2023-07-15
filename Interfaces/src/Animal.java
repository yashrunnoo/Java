interface FlightEnabled{

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    public void land();
    abstract void takeOff();
    void fly();

}
interface Trackable{
    void track();
}
public abstract class Animal {
    public abstract void move();
}
