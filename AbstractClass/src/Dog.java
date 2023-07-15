public class Dog extends Mammal {

    public void shedHair(){
        System.out.println(getExplicitType() + " shed hair all the time");
    }
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void makeNoise() {
        System.out.println(getExplicitType());
        if(type == "wolf"){
            System.out.println("Howling");
        }
        else {
            System.out.println("Woof");
        }
    }
    public void move(String speed) {
        if (speed == "slow"){
            System.out.println("walking");
        }
        else{
            System.out.println("running");
        }
    }
}
