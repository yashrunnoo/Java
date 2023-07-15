public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void makeNoise() {
        System.out.println(getExplicitType());
        if (type == "wolf") {
            System.out.print(" lazily swimming");
        } else {
            System.out.print(" darting frantically");
        }
    }

    public void move(String speed) {
        if (speed == "goldfish") {
            System.out.println("swish");
        } else {
            System.out.println("splash");
        }
    }
}
