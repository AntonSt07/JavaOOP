package Interfaces;

public class InterfaceDemo {
    public static void main(String[] args){
        MountainBike m = new MountainBike(20, 1, 5);
        System.out.println(m.getSeatHeight());
        System.out.println(m.getGear());
        System.out.println(m.getSpeed());
        m.speedUp(20);
        m.setGear(3);
        System.out.println();
        System.out.println(m.getSpeed());
        System.out.println(m.getGear());
        m.applyBrake(7);
        System.out.println();
        System.out.println(m.getSpeed());
    }
}
