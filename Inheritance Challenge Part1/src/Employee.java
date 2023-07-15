public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;
    public Employee(String name, String birthDate,String hireDate){
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
    public String toString(){
        return "employee{ " +"employeeId = " + employeeId + " hireDate = " + hireDate + "}" + super.toString();
    }
}
