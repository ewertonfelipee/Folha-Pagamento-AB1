package PaymentMethod;

public class DepositAccount implements StatePaymentMethod {

    @Override
    public int toInt() {
        return 3;
    }
}
