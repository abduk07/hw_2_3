public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;

    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы начислили " + sum);
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > getAmount()) {
            throw new LimitException("Вы не можете снять больше чем у вас на счете ", getAmount());
        }
        amount -= sum;
        System.out.println("Вы сняли " + sum);
    }
}
