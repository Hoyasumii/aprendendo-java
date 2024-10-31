package testing.exceptions;

public class GreaterThanTwoException extends RuntimeException {
    public GreaterThanTwoException() {
        super("O número é maior que 2");
    }
}
