public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color="Gray";
    private int doors= 2;
    private boolean convertible = true;

    //public setters and getters

    public String getMake(){
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor(){
        return color;
    }

    public boolean getConvertible()
    {
        return  convertible;
    }
    //Setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setDoors(int doors){
        this.doors= doors;
    }
    public void setConvertible(boolean convertible){
        this.convertible= convertible;;
    }
    public void describeCar ()
    {
        System.out.println(doors + "- Door " +
                        color + " " +
                        make + " " +
                        model + " " +
                (convertible ? "Convertible":""));
    }

    public static void main(String[] args) {
//        Main m = new Main();

        for(int i = 0; i < 5; i++) {
            System.out.println("Want to leave VIT asap");
        }

    }
}