public class Car {
    private String make;
    private String model;
    private String color;
    private boolean isRunning;
    private boolean isBrakeApplied;
    private String transmission;

    public Car(String make, String model, String color) throws IncompleteCarConfigurationException {
        if (make == null || model == null || color == null) {
            throw new IncompleteCarConfigurationException("Make, model, and color must be provided.");
        }
        this.make = make;
        this.model = model;
        this.color = color;
    }

    // Other methods...

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    public void start() throws CarAlreadyRunningException, CarNotInParkException, BrakesNotAppliedException {
        if (isRunning) {
            throw new CarAlreadyRunningException("Car is already running.");
        }
        if (!transmission.equals("P")) {
            throw new CarNotInParkException("Car is not in park transmission.");
        }
        if (!isBrakeApplied) {
            throw new BrakesNotAppliedException("Brakes are not applied.");
        }
        isRunning = true;
        System.out.println("Car started.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    public void applyBrake() {
        isBrakeApplied = true;
        System.out.println("Brakes applied.");
    }

    public void releaseBrake() {
        isBrakeApplied = false;
        System.out.println("Brakes released.");
    }

    public boolean isBrakeApplied() {
        return isBrakeApplied;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        System.out.println("Transmission set to " + transmission + ".");
    }
}


