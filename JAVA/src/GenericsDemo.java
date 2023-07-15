class GenericsDemo<T> {

    private T data;

    public GenericsDemo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(data);
    }

    public static void main(String[] args) {
        GenericsDemo<Integer> intDemo = new GenericsDemo<>(10);
        intDemo.printData();

        GenericsDemo<String> stringDemo = new GenericsDemo<>("Hello World!");
        stringDemo.printData();
    }
}