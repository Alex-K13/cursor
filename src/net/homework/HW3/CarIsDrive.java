package net.homework.HW3;

public class CarIsDrive {
    public static void main(String[] args) {
        Car VW = new Car();

        VW.startEngine();
        VW.move();
        VW.cruise(100);
        VW.stopEngine();
    }
}