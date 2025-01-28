// Classe pour le paiement via PayPal
class Paypal implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Paiement de " + amount + " EUR via PayPal effectué.");
    }
}