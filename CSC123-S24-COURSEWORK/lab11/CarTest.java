public class CarTest {
    public static void main(String[] args) {
        try {
            new Car("Toyota", null, "Red");
        } catch (IncompleteCarConfigurationException e) {
            System.out.println("Test case 1 failed: " + e.getMessage());
        }

        try {
            // Test case 2: Car started without applying brakes
            Car myCar = new Car("Toyota", "Corolla", "Red");
            myCar.setTransmission("P");
            myCar.start();
        } catch (BrakesNotAppliedException | CarNotInParkException | CarAlreadyRunningException | IncompleteCarConfigurationException e) {
            System.out.println("Test case 2 failed: " + e.getMessage());
        }

        try {
            // Test case 3: Car started without being in park transmission
            Car myCar = new Car("Toyota", "Corolla", "Red");
            myCar.applyBrake();
            myCar.setTransmission("D");
            myCar.start();
        } catch (BrakesNotAppliedException | CarNotInParkException | CarAlreadyRunningException | IncompleteCarConfigurationException e) {
            System.out.println("Test case 3 failed: " + e.getMessage());
        }

        try {
            // Test case 4: Car started while already running
            Car myCar = new Car("Toyota", "Corolla", "Red");
            myCar.applyBrake();
            myCar.setTransmission("P");
            myCar.start();
            myCar.start();
        } catch (BrakesNotAppliedException | CarNotInParkException | CarAlreadyRunningException | IncompleteCarConfigurationException e) {
            System.out.println("Test case 4 failed: " + e.getMessage());
        }

        try {
            // Test case 5: Successful start of the car
            Car myCar = new Car("Toyota", "Corolla", "Red");
            myCar.applyBrake();
            myCar.setTransmission("P");
            myCar.start();
        } catch (BrakesNotAppliedException | CarNotInParkException | CarAlreadyRunningException | IncompleteCarConfigurationException e) {
            System.out.println("Test case 5 failed: " + e.getMessage());
        }

        // Additional test cases can be added here...
    }
}

