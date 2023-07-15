import java.util.Random;

class NumberGenerator implements Runnable {
    private int[] numbers;
    private int count;
    private Object lock;

    public NumberGenerator(Object lock) {
        numbers = new int[10];
        count = 0;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (lock) {
                while (count == numbers.length) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int number = new Random().nextInt(101);
                numbers[count] = number;
                count++;

                if (count == numbers.length) {
                    lock.notifyAll();
                }
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}

class SumCalculator implements Runnable {
    private int[] numbers;
    private Object lock;

    public SumCalculator(int[] numbers, Object lock) {
        this.numbers = numbers;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (lock) {
                while (numbers.length < 10) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }

                System.out.println("Sum of the ten numbers: " + sum);

                numbers = new int[0];
                lock.notifyAll();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        NumberGenerator numberGenerator = new NumberGenerator(lock);
        SumCalculator sumCalculator = new SumCalculator(numberGenerator.getNumbers(), lock);

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(sumCalculator);

        thread1.start();
        thread2.start();
    }
}
