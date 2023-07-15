//public class GradeCalculatorThreads {
//    public static void main(String[] args) {
//        StudentGradeThread gradeThread = new StudentGradeThread();
//        StudentInfoThread infoThread = new StudentInfoThread(gradeThread);
//
//        int numIterations = 5; // Number of iterations
//
//        for (int i = 1; i <= numIterations; i++) {
//            System.out.println("Iteration: " + i);
//            infoThread.start(); // Start the info thread
//            gradeThread.start(); // Start the grade thread
//
//            try {
//                infoThread.join(); // Wait for the info thread to finish
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class StudentGradeThread extends Thread {
//    private int paper1Marks;
//    private int paper2Marks;
//    private int cumulativeGPA;
//
//    public void run() {
//        // Generate random marks for paper 1 and paper 2
//        paper1Marks = (int) (Math.random() * 101);
//        paper2Marks = (int) (Math.random() * 101);
//
//        // Assign grades based on marks
//        String grade1 = assignGrade(paper1Marks);
//        String grade2 = assignGrade(paper2Marks);
//
//        // Compute cumulative grade point average
//        cumulativeGPA = computeCumulativeGPA(grade1, grade2);
//    }
//
//    private String assignGrade(int marks) {
//        if (marks >= 80 && marks <= 100) {
//            return "A";
//        } else if (marks >= 60 && marks < 80) {
//            return "B";
//        } else {
//            return "C";
//        }
//    }
//
//    private int computeCumulativeGPA(String grade1, String grade2) {
//        int gpa1 = (grade1.equals("A")) ? 10 : 8;
//        int gpa2 = (grade2.equals("A")) ? 10 : 8;
//        return (gpa1 + gpa2) / 2;
//    }
//
//    public int getPaper1Marks() {
//        return paper1Marks;
//    }
//
//    public int getPaper2Marks() {
//        return paper2Marks;
//    }
//
//    public int getCumulativeGPA() {
//        return cumulativeGPA;
//    }
//}
//
//class StudentInfoThread extends Thread {
//    private StudentGradeThread gradeThread;
//
//    public StudentInfoThread(StudentGradeThread gradeThread) {
//        this.gradeThread = gradeThread;
//    }
//
//    public void run() {
//        try {
//            gradeThread.join(); // Wait for the grade thread to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        int paper1Marks = gradeThread.getPaper1Marks();
//        int paper2Marks = gradeThread.getPaper2Marks();
//        int cumulativeGPA = gradeThread.getCumulativeGPA();
//
//        String studentName = "John Doe"; // Student name (replace with actual name)
//
//        System.out.println("Student Name: " + studentName);
//        System.out.println("Paper 1 Marks: " + paper1Marks);
//        System.out.println("Paper 2 Marks: " + paper2Marks);
//        System.out.println("Cumulative GPA: " + cumulativeGPA);
//        System.out.println();
//    }
//}
