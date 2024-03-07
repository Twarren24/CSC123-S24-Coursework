import java.io.Serializable;

public class IncompleteCarConfigurationException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public IncompleteCarConfigurationException(String message) {
        super(message);
    }
}
