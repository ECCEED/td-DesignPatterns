public class Bicycle extends Vehicule {
    private int currentSpeed;

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public int getSpeed() {
        return currentSpeed; // Les vélos peuvent avoir une vitesse variable
    }
}
