public class Point {
    private int x;
    private int y;

    //Constructors
    public Point() {
        //Empty Constructor
    }

    //Parametrized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    With no Parameters
    public double distance() {
        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return dist;
    }

    //WithTwoParameters
    public double distance(int x, int y){
        double dist = Math.sqrt(Math.pow((this.x - x),2) + Math.pow(this.y - y,2));
        return dist;
    }

    public double distance(Point test){
        double dist = Math.sqrt(Math.pow(x - test.x,2) + Math.pow(y-test.y,2));
        return dist;
    }

    public static void main(String[] args) {

//        System.out.println(Math.pow(2, 3));
//        System.out.println((int)Math.sqrt(16));
        Point p = new Point(6,5);
        Point p2 = new Point(3,1);
        Point point = new Point();

        System.out.println(p.distance());
        System.out.println(p.distance(p2));
        System.out.println(p.distance(2,2));
        System.out.println(point.distance());
    }
}
