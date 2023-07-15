public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void shedHair() {
        System.out.println(getExplicitType() + " Sheds hair in the spring");
    }

    public void makeNoise() {

    }
}
