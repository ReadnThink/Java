package sec08.exam03_method_call;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.keyTurnon();
        myCar.run();

        int speed = myCar.getSpeed();
        System.out.println("íėŽėë: " + speed + "km/h");
    }
}
