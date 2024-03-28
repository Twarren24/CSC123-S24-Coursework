public class ZooKeeper {
    public static void main(String[] args) {
        // Step 4: Creating instances of different animal objects
        Animal lion = new Lion("Simba", 5, 200);
        Animal elephant = new Elephant("Dumbo", 10, 500);
        Animal monkey = new Monkey("Jack", 3, 50);

        // Step 4: Calling their methods to observe the output
        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
        
        // Step 5: Demonstrating polymorphism
        Animal[] animals = {lion, elephant, monkey};
        for (Animal animal : animals) {
            animal.makeSound(); // Dynamic method dispatch
        }
    }
}

