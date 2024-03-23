import java.util.ArrayList;
import java.util.List;

class Registration {
    private Owner owner;
    private Vehicle vehicle;
    private List<Citation> citations;

    public Registration(Owner owner, Vehicle vehicle) {
        this.owner = owner;
        this.vehicle = vehicle;
        this.citations = new ArrayList<>();
    }

    public void registerCitation(Citation citation) {
        citations.add(citation);
    }

    // Getters
    public Owner getOwner() {
        return owner;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<Citation> getCitations() {
        return citations;
    }
}

