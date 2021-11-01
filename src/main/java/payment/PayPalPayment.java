package payment;

public class PayPalPayment implements Payment{
    @Override
    public String pay(double price) {
        return "You paid " + price + " successfully with PayPal!";
    }
}
