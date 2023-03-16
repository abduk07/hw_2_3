public class LimitException extends Exception {
    double getRemainingAmount;

    public LimitException(String message, double getRemainingAmount) {
        super(message);
        this.getRemainingAmount = getRemainingAmount;
    }
    public static void getRemainingAmount(){}
}
