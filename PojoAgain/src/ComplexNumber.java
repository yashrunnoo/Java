public class ComplexNumber {
    private double real;
    private double imaginary;

    //Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //Getters
    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    //Methods
    public void add(double real, double imag){
        imaginary += imag;
        this.real += real;
    }
    public void add(ComplexNumber p){
        real += p.real;
        imaginary += p.imaginary;
    }
    public void subtract(double real, double imag){
        imaginary -= imag;
        this.real -= real;
    }
    public void subtract(ComplexNumber p){
        real -= p.real;
        imaginary -= p.imaginary;
    }
}
