public class Wall {
    private double width;
    private double height;

    public Wall(){
        System.out.println("Default constructor called");
    }

    public Wall(double width, double height){
        if(width >=0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else if (width < 0 && height >=0) {
            this.width = 0;
            this.height = height;
        }else if (width >= 0 && height <0) {
            this.width = width;
            this.height = 0;
        }else{
            this.width = 0;
            this.height = 0;
            }
    }
    public double getWidth(){
        return width;
    }
    public  double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        return height * width;
    }

}
