package exception;

public class WrongAccountCountryCodeException extends MyCheckedException{

    public WrongAccountCountryCodeException(String message) {
        super(message);
    }
}
