package Bicycle;

class Bycycle {
    protected int speed;
    int gear;
    public Bycycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public void increaseGear(int gearUp){
        this.gear += gearUp;
        this.speed += gearUp * 5;
    }
    public void decreaseGear(int gearDown){
        this.gear -= gearDown;
        this.speed -= gearDown * 5;
    }
    public void applyBrake(int brake){
        this.speed -= brake;
    }
    public void applyGas(int gas){
        this.speed += gas;
    }
}
