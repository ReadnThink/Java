package sec06.exam01_field_declaration;
// 클래스를 만들어보고 초기화 되지않은 필드값을 변경해보기.
public class CarExample {
    public static void main(String args[]){
        Car myCar = new Car();

        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);
        //라이브러리 class에서 speed는 값을 초기화하지 않아서 0이나와 외부에서 변경
        myCar.speed = 60;
        System.out.println("현재속도 : " + myCar.speed);
    }
}
