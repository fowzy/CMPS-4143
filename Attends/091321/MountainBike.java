public class MountainBike extends Bicycle {
    public int seatHeight;

    // Constructor for the child class
    public MountainBike(int gear, int speed, int sh) {
        // calling the parent class constructor
        super(gear, speed);
        seatHeight = sh;
    }

    // Methods
    public void setHeight(int newSeatHeight) {
        seatHeight = newSeatHeight;
    }

    @Override
    // Method with same name as the parent class so what's going to happen now is
    // the child class you will overwrite the result from the parent class.
    public String showStatus() {
        return ("I'm the child and this is my gear: " + gear + "\nSpeed is: " + speed + "\nMy seat Height is :"
                + seatHeight);
    }
}