public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast"); // passing animal object as dog object in the function, valid since dog 'is a' animal

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Labrador Retriever", 65,"Floppy","swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("wolf",40);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("Goldfish",.25,2,3);
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
