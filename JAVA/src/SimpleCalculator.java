public class SimpleCalculator {
    private double firstNumber, secondNumber;

    //setters
    public void setFirstNumber(double number){
        firstNumber = number;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //getters
    public double getFirstNumber()
    {
        return firstNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult()
    {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println(calc.getAdditionResult());
    }
}
