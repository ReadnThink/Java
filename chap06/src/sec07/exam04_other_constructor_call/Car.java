package sec07.exam04_other_constructor_call;
//다른생성자 호출 코드this()를 활용하여 생성자 사용
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
    }
    Car(String model) {
        /*this.model = model;
        this.color = null;
        this.maxSpeed = 0;*/

        //System.out.println("Car(String model) 실행");
        //this()코드는 첫줄에 와야한다. 함수를 사용하려면 this()뒤에 사용해야한다.

        this(model, null, 0);

        System.out.println("Car(String model) 실행 / this 뒤에와도 되는지 확인!");
    }

    Car(String model, String color) {
        /*this.model = model;
        this.color = color;
        this.maxSpeed = 0;*/
        this(model,color,0);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
