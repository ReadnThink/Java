package sec07.exam03_constructor_overloading;
//생성자 오버로딩(생성자를 다양하게 만드는것) 연습
//매개변수를 변경하는 것이 아니라, 타입, 개수를 달리 해야한다.
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
    }
    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
