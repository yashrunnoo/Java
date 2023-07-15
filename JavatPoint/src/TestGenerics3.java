class MyGen <T>{
    T obj;

    void add(T obj){
        this.obj=obj;
    }

    T get(){
     return obj;
    }
}
public class TestGenerics3 {
    public static void main(String[] args) {
        MyGen<Integer> myInt = new MyGen<>();
        myInt.add(2);
        System.out.println(myInt.get());

        MyGen<String> myString = new MyGen<>();
        myString.add("s");
        System.out.println(myString.get());
    }
}
