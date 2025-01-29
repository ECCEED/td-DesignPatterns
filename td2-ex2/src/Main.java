//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création de différents types de véhicules
        Vehicule car = new MotorizedVehicle(100); // Une voiture roule à 100 km/h
        Vehicule bike = new Bicycle(20);         // Un vélo roule à 20 km/h

        // Affichage des vitesses (respect du contrat LSP)
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
        System.out.println("Bicycle speed: " + bike.getSpeed() + " km/h");
    }
}