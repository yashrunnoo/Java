public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getEarShape() {
        return earShape;
    }

    public Dog() {
        super("Berger", "Biiig", 50);
    }

    public Dog(int x) {
        super("Chien", "petit", 20);
    }

    public Dog(String type, double weight) {
        this(type, weight, " Perky", " Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{ earShape= " + earShape + ", tailShape= " + tailShape + " //super = " + super.toString();
    }

    public void makeNoise() {
        if (type == "wolf") {
            System.out.println("Ow Wooooo !!! ");
        }
        bark();
        System.out.println();
    }


    public void move(String speed) {
        super.move(speed);
        System.out.println("dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            bark();
            run();
        }
    }

    private void bark() {
        System.out.println("Woof !!");
    }

    private void run() {
        System.out.println("Dog running !!");
    }

    private void walk() {
        System.out.println("Dog Walking !!");
    }

    private void wagTail() {
        System.out.println("Wagging tail !!");
    }
}