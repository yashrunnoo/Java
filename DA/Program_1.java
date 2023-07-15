import java.security.SecureRandom;
import java.lang.Math;
import java.util.Arrays;

public class Program_1{

    public static double[] generate_expected(){
        double x[] = {0,0,0,0,0,0,0,0,0,0,0};
        double y[] = {1,2,3,4,5,6,5,4,3,2,1};
        for(int i=0; i<x.length; i++){
            double temp = (double)y[i]/36;
            double temp_2 = temp*1296;
            x[i] = (double)temp_2;
        }
        return x;
    }

    public static int roll(){
        SecureRandom rand = new SecureRandom();
        int upper = 6;
        int dice_1 = rand.nextInt(upper) + 1;
        int dice_2 = rand.nextInt(upper) + 1;
        return dice_1 + dice_2;
    }

    public static void main(String[] args) {
        int x = 0;
        double observed[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        while(x!= 1296){
            observed[roll()] += 1;
            x++;
        }

        double observed_actual[] = Arrays.copyOfRange(observed, 2, 13);
        double expected[] = generate_expected();

        double sum = 0;
        for(int i = 0; i<expected.length; i++){
            sum += (Math.pow((observed_actual[i] - expected[i]),2))/expected[i];
        }
        double critical_value = 18.307;

        if (sum > critical_value){
            System.out.println("Biased");
        } else {
            System.out.println("Unbiased");
        }
    }
}
