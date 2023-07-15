public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 2;
    private boolean convertible = true;

    //Getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors(){
        return doors;
    }
    public boolean isConvertible()
    {
        return convertible;
    }
    //Setters

    public void setMake(String make1){
//        make = make1;
        if(make1 == null)
            make = "Unknown";

        switch(make1.toLowerCase()){
            case "holden", "porsche", "tesla" -> make = make1;
            default -> make = "Unsupported";
        }
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    //Methods
    public void describeCar()
    {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + "" + (convertible ? " Convertible":" "));
    }
}
