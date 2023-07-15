//public class GradeThreadDemo {
//    public static void main(String[] args) {
//        GradeThread gradeThread = new GradeThread();
//        DisplayThread displayThread = new DisplayThread(gradeThread);
//        gradeThread.start();
//        displayThread.start();
//    }
//}
//
//class GradeThread extends Thread {
//    private static final int NUM_ITERATIONS = 5;
//
//    private String[] names = {"Alice", "Bob", "Charlie", "David", "Emily"};
//    private int[][] marks = {{70, 85}, {90, 80}, {75, 70}, {60, 90}, {80, 75}};
//    private String[] grades = new String[5];
//    private double[] gpas = new double[5];
//
//    public void run() {
//        for (int i = 0; i < NUM_ITERATIONS; i++) {
//            // Calculate grades and GPAs for each student
//            for (int j = 0; j < names.length; j++) {
//                int totalMarks = marks[j][0] + marks[j][1];
//                double avgMarks = totalMarks / 2.0;
//                if (avgMarks >= 80) {
//                    grades[j] = "A";
//                    gpas[j] = 10.0;
//                } else if (avgMarks >= 60) {
//                    grades[j] = "B";
//                    gpas[j] = 8.0;
//                } else {
//                    grades[j] = "C";
//                    gpas[j] = 5.0;
//                }
//            }
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public String[] getGrades() {
//        return grades;
//    }
//
//    public double[] getGPAs() {
//        return gpas;
//    }
//}
//
//class DisplayThread extends Thread {
//    public GradeThread gradeThread;
//
//    public DisplayThread(GradeThread gradeThread) {
//        this.gradeThread = gradeThread;
//    }
//
//    public void run() {
//        for (int i = 0; i < GradeThread.NUM_ITERATIONS; i++) {
//            System.out.println("Iteration " + (i + 1));
//            String[] grades = gradeThread.getGrades();
//            double[] gpas = gradeThread.getGPAs();
//            for (int j = 0; j < grades.length; j++) {
//                System.out.println(gradeThread.names[j] + ": " + grades[j] + " (" + gpas[j] + ")");
//            }
//            System.out.println();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
