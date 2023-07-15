public class Carpet {
    private double cost;

    //    constructor
    public Carpet(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }   //constructor

    //Cost getter
    public double getCost() {
        return cost;
    }
}