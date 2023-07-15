public class Animal {
    private String type;
    private String size;
    private double weight;

    @Override
    public String toString() {
        return "Animal{ type = " + type + "size = " + size + "weight = " + weight;
    }

    //Constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(){};

    public void move(String speed){
        System.out.println(type + "Moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + "makes some kind of noise");
    }
}
