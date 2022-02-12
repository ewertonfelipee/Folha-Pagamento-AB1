package PaymentMethod;

public class DepositAccount implements PaymentMethod {

    @Override
    public int toInt() {
        return 3;
    }
}
