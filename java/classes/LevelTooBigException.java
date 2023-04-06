package classes;

public class LevelTooBigException extends Exception {
    public LevelTooBigException(String errorMessage) {
        super(errorMessage);
    }
}
