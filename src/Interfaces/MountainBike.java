package Interfaces;

public class MountainBike implements Bicycle{
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int startSeatHeight, int startGear, int startSpeed){
        seatHeight = startSeatHeight;
        gear = startGear;
        speed = startSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public int getSpeed() {
        return speed;
    }
}
