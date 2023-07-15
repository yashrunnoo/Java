import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd","big",150));
        animals.add(new Fish("goldfish","small",1));
        animals.add(new Fish("Barracuda","big",20));
        animals.add(new Dog("Pug","small",3));
        animals.add(new Horse("Mustang","large",1000));

        for(Animal zanimo : animals){
            doAnimalStuff(zanimo);
            System.out.println("__________");
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
        if(animal instanceof Mammal currentMammal){
            currentMammal.shedHair();
        }
    }
}
