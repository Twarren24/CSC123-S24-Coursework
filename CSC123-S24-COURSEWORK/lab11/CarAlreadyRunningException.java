import java.io.Serializable;

public class CarAlreadyRunningException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarAlreadyRunningException(String message) {
        super(message);
    }
}

