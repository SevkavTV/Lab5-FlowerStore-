package payment;

public class CreditCardPayment implements Payment{
    @Override
    public String pay(double price) {
        return "You paid " + price + " successfully with credit card!";
    }
}
