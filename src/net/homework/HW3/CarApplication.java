package net.homework.HW3;

    public class CarApplication {
        public static void main(String[] args) {
            Car VW = new Car(10);
            VW.startEngine(false);
            VW.cruise(100);
            VW.stopEngine();
        }
    }

