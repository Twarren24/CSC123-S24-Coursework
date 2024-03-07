import java.io.Serializable;

public class CarNotInParkException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarNotInParkException(String message) {
        super(message);
    }
}
