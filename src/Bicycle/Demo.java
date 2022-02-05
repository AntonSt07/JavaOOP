package Bicycle;

public class Demo {
    public static void main(String[] args){
        MountainBike bike = new MountainBike(5, 1, 20);
        System.out.println("Gear is "+ bike.gear);
        System.out.println("Seat height is "+ bike.seatHeight);
        System.out.println("Bike speed is "+ bike.speed);
        bike.increaseGear(2);
        System.out.println();
        System.out.println("New gear is "+ bike.gear);
        System.out.println("New speed is "+ bike.speed);
        System.out.println();
        bike.applyBrake(5);
        System.out.println("After break speed "+ bike.speed);
        System.out.println();
        bike.setSeatHeight(30);
        System.out.println("New seat height is "+ bike.seatHeight);
        System.out.println();
        bike.decreaseSeatHeight(5);
        System.out.println("New height is: "+ bike.seatHeight);
        bike.increaseSeatHeight(2);
        System.out.println("New height is: "+ bike.seatHeight);
    }
}
