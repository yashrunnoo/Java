public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double ydist = Math.pow((y-0),2);
        double xdist = Math.pow((x-0),2);
        return Math.pow((ydist+xdist),(1/2));
    }

    public double distance(int x_coor, int y_coor){
        double ydist = Math.pow((y_coor-0),2);
        double xdist = Math.pow((x_coor-0),2);
        return Math.pow((ydist+xdist),(1/2));
    }

    public double distance(Point a, Point b){
        double xPart = Math.pow((a.x -  b.x),2);
        double yPart = Math.pow((a.y=b.y),2);
        return Math.pow(xPart + yPart,0.5);
    }

}
