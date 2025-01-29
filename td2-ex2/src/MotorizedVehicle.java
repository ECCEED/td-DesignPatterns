// Sous-classe pour les véhicules motorisés
public class MotorizedVehicle extends Vehicule {
    private int speed;

    public MotorizedVehicle(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
