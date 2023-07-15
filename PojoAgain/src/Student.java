public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    // Constructor
    public Student(String id, String name, String dateOfBirth, String classList) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList + "}";
    }
}