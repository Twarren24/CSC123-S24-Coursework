import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class DMV {
    private String state;
    private List<Registration> registrations;

    public DMV(String state) {
        this.state = state;
        this.registrations = new ArrayList<>();
    }

    public void registerVehicle(Owner owner, Vehicle vehicle) throws Exception {
        // Check if the vehicle has any pending citations
        for (Registration registration : registrations) {
            if (registration.getVehicle().equals(vehicle)) {
                for (Citation citation : registration.getCitations()) {
                    if (!citation.getStatus().equals("Paid")) {
                        throw new Exception("Vehicle has pending citations. Cannot register.");
                    }
                }
            }
        }
        // Create a new registration
        Registration newRegistration = new Registration(owner, vehicle);
        registrations.add(newRegistration);
    }

    public void registerCitation(String plate, Citation citation) throws Exception {
        boolean found = false;
        for (Registration registration : registrations) {
            if (registration.getVehicle().getPlate().equals(plate)) {
                registration.registerCitation(citation);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new Exception("Vehicle not found. Cannot create citation.");
        }
    }

    public List<Registration> listRegistrations() {
        return registrations;
    }

    public List<Citation> listCitations() {
        List<Citation> allCitations = new ArrayList<>();
        for (Registration registration : registrations) {
            allCitations.addAll(registration.getCitations());
        }
        return allCitations;
    }

    public List<Registration> searchRegistrationsByPlate(String plate) {
        List<Registration> result = new ArrayList<>();
        for (Registration registration : registrations) {
            if (registration.getVehicle().getPlate().equals(plate)) {
                result.add(registration);
            }
        }
        return result;
    }

    public List<Registration> searchRegistrationsByOwner(Owner owner) {
        List<Registration> result = new ArrayList<>();
        for (Registration registration : registrations) {
            if (registration.getOwner().equals(owner)) {
                result.add(registration);
            }
        }
        return result;
    }

    public List<Citation> searchCitationsByVehicle(String plate) {
        List<Citation> result = new ArrayList<>();
        for (Registration registration : registrations) {
            if (registration.getVehicle().getPlate().equals(plate)) {
                result.addAll(registration.getCitations());
            }
        }
        return result;
    }

    public List<Citation> searchCitationsByOwner(Owner owner) {
        List<Citation> result = new ArrayList<>();
        for (Registration registration : registrations) {
            if (registration.getOwner().equals(owner)) {
                result.addAll(registration.getCitations());
            }
        }
        return result;
    }
}



