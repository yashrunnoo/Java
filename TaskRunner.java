import java.util.Random;

//Main Class
public class TaskRunner {
    public static void main(String[] args) {
        firstTask firstTask = new firstTask();
        secondTask secondTask = new secondTask();

        Thread thread1 = new Thread(firstTask);
        Thread thread2 = new Thread(secondTask);

        thread1.start();
        thread2.start();
    }
}

//First task
class firstTask implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Second task
class secondTask implements Runnable {
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            int randomNumber = random.nextInt(140) + 110;
            System.out.println(randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
