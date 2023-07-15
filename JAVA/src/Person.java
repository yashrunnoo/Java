public class Person {
    private String firstName = "", lastName = "";
    private int age = 0;

    //setters
   public void setFirstName(String x){
       firstName = x;
   }
    public void setLastName(String y){
       lastName = y;
    }
    public void setAge(int z){
       if(z < 0 || z > 100)
       {
           age = 0;
           return;
       }
       age = z;
    }
    //Getters
    public String getFirstName(){
       return lastName;
    }
    public String getLastName(){
       return lastName;
    }
    public int getAge(){
       return age;
    }
    public String getFullName(){
       String fullName = "";
       if(firstName.isEmpty() && lastName.isEmpty()){
           return fullName;
       }
       else if (lastName.isEmpty()){
           return firstName;
       }
       else if(firstName.isEmpty()){
           return lastName;
       }
       else
           return firstName + " " + lastName;
    }
}
