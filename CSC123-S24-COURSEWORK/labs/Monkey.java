public class Monkey extends Animal {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chatters.");
    }
}

