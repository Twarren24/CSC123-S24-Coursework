public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars.");
    }
}

