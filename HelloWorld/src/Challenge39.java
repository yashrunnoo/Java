public class Challenge39 {
    public static void main(String[] args) {
        double firstDouble = 20d, secondDouble = 80d, calculatedValue;
        calculatedValue = (firstDouble + secondDouble) * 100;

        double remainder_step_40 =  calculatedValue % 40;

        boolean result = (remainder_step_40 == 0) ? true : false;

        System.out.println("Result of operation is : " + result);

        if(!result)
        {
            System.out.println("Got some remainder");
        }
    }
}
