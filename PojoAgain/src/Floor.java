public class Floor {
    private double width;
    private double length;

    //Constructor
    public Floor(double x, double y) {
        if (x == 0) {
            width = 0;
        } else {
            width = x;
        }

        if (y == 0) {
            length = 0;
        } else {
            length = y;
        }
    }

    //Area method
    public double getArea(){
        return length * width;
    }
}
