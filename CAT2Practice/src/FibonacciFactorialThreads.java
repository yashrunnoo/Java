public class FibonacciFactorialThreads {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        FactorialThread factorialThread = new FactorialThread();
        fibonacciThread.start();
        factorialThread.start();
    }
}

class FibonacciThread extends Thread {
    private int count = 0;

    public void run() {
        int num1 = 0, num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        while (count < 8) {
            int sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
            count++;
            if (count % 10 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class FactorialThread extends Thread {
    public void run() {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}

