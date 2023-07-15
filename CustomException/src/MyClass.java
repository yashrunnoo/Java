class MyClass {
    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws InvalidNumberException {
        if (number < 0) {
            throw new InvalidNumberException("Number must be greater than or equal to 0.");
        }
        this.number = number;
    }

    public static void main(String[] args) {
        try {
//            MyClass obj = new MyClass(5);
//            System.out.println("Initial number: " + obj.getNumber());
//            obj.setNumber(-10);
//            System.out.println("New number: " + obj.getNumber());

            MyClass objNeg = new MyClass(-5);
            System.out.println("Initial number: " + objNeg.getNumber());
            objNeg.setNumber(-10);
            System.out.println("New number: " + objNeg.getNumber());


        } catch (InvalidNumberException e) {
            System.out.println("Invalid number: " + e.getMessage());
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
