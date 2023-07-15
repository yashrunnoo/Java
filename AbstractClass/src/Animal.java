public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.weight = weight;
        this.type = type;
        this.size = size;
    }

    //Abstract methods cannot have a body
    //and cannot be of private type
    public abstract void move(String speed);

    public abstract void makeNoise();

    //Concrete class
    public String getExplicitType() {
        return getClass().getTypeName() + "(" + type + ")";
    }
}

abstract class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        System.out.println(getExplicitType());
        System.out.println((speed.equals("slow") ? "slow Horse" : "Fast Horse"));
    }

    public abstract void shedHair();
}