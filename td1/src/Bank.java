// Classe pour le virement bancaire
class Bank implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Virement bancaire de " + amount + " EUR effectué.");
    }
}