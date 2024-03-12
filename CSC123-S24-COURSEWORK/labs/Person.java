
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM/dd/yy"));
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dateOfBirth.getYear();
        if (dateOfBirth.getDayOfYear() > currentDate.getDayOfYear()) {
            age--;
        }
        return age;
    }

    public static void main(String[] args) {
        // Example usage
        Person person = new Person("John", "Doe", "05/20/90");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}
