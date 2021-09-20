package bmi;

public class Validation extends RuntimeException {
    public Validation(String msg) {
        super(msg);
    }
}
