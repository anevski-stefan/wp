package mk.finki.ukim.mk.lab.model.exception;

/**
 * Author: Stefan Anevski
 */
public class InvalidClientDetailsException extends RuntimeException{
    public InvalidClientDetailsException() {
        super("Invalid client details exception");
    }
}
