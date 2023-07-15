public class GradePointAverageThreads {
    public static void main(String[] args) {
        StudentThread studentThread = new StudentThread();
        GradeThread gradeThread = new GradeThread(studentThread);
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + (i+1) + ":");
            studentThread.generateMarks();
            gradeThread.displayGrade();
            System.out.println();
        }
    }
}

class StudentThread extends Thread {
    private int marks1, marks2;
    private String name;

    public void generateMarks() {
        marks1 = (int)(Math.random() * 101);
        marks2 = (int)(Math.random() * 101);
        name = "dfdg";
        System.out.println("Student marks: " + marks1 + " and " + marks2);
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public String getName1() {
        return name;
    }
}

class GradeThread extends Thread {
    private StudentThread studentThread;
    private String name;
    private String grade;
    private double gpa;

    public GradeThread(StudentThread studentThread) {
        this.studentThread = studentThread;
    }

    public void displayGrade() {
        try {
            studentThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int marks1 = studentThread.getMarks1();
        int marks2 = studentThread.getMarks2();
        String name = studentThread.getName1();
        double avg = (marks1 + marks2) / 2.0;
        if (avg >= 80) {
            grade = "A";
            gpa = 10;
        } else if (avg >= 60) {
            grade = "B";
            gpa = 8;
        } else {
            grade = "C";
            gpa = 6;
        }
        System.out.println("Student name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
    }

    public void run() {
        name = "Yash";
    }
}

