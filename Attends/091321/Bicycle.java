class Bicycle {

    // Attributes
    public int gear;
    public int speed;

    // Constructor
    public Bicycle(int g, int s) {
        this.gear = g;
        this.speed = s;
    }

    // Behaviors
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String showStatus() {
        return ("Gear on : " + gear + "\n" + "Speed is : " + speed);
    }

}