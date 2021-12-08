interface Vehicle{
    public void changeGear(int n);
    public void speedUp(int n);
    public void applyBrake(int n);
}

class Bicycle implements Vehicle{
    public int gear;
    public int speed;
    public void changeGear(int myGear){
        gear = myGear;
    }
    public void speedUp(int n){
        speed+=n;
    }
    public void applyBrake(int n){
        speed-=n;
    }
}

class BicycleControl {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.applyBrake(10);
        b1.speedUp(30);
        b1.changeGear(4);
    }    
}