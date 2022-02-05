package Bicycle;

public class MountainBike extends Bycycle{
    int seatHeight;
    public MountainBike(int speed, int gear, int seatHeight) {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }
    public void setSeatHeight(int newHeight){
        this.seatHeight = newHeight;
    }
    public void increaseSeatHeight(int heightUp){
        this.seatHeight += heightUp;
    }
    public void decreaseSeatHeight(int heightDown){
        this.seatHeight -= heightDown;
    }
}
