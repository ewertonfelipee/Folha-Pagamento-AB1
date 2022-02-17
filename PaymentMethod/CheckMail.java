package PaymentMethod;

public class CheckMail implements StatePaymentMethod{

    @Override
    public int toInt() {
        return 1;
    }
}
