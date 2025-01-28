// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {

        PaymentProcessor paypalProcessor = new PaymentProcessor(new Paypal());
        paypalProcessor.processPayment(150.0);
        PaymentProcessor bankTransferProcessor = new PaymentProcessor(new Bank());
        bankTransferProcessor.processPayment(200.0);
    }
}