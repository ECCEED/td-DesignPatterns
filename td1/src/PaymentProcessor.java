// Classe PaymentProcessor qui respecte OCP
class PaymentProcessor {
    private PaymentMethod paymentMethod;
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.process(amount);
    }
}