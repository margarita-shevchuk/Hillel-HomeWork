public class StrangeColourException extends Exception {

    public StrangeColourException() {
        super();
    }

    public StrangeColourException(String message) {
        super(message);
    }

    public StrangeColourException(String message, Throwable cause) {
        super(message, cause);
    }

    public StrangeColourException(Throwable cause) {
        super(cause);
    }

    protected StrangeColourException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}