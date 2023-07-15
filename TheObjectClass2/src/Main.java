public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        PrimaryClassStudent jimmy = new PrimaryClassStudent("Jimmy", 8 , "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Student { name= " + name + ",age = " + age + "}";
    }
}

class PrimaryClassStudent extends Student {
    private String parentName;

    PrimaryClassStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    public String toString(){
        return parentName + " is the parent of " + super.toString();
    }
}