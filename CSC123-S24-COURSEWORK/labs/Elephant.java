public class Elephant extends Animal {
    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets.");
    }


    }

