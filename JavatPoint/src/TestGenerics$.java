public class TestGenerics$ {
    public static <E> void printArray(E[] elements) {
        for(E e: elements){
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'j','a','g','g','f'};
        printArray(intArray);
        printArray(charArray);
    }
}
