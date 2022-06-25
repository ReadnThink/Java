package sec08.exam01_method_declaration;

import sec08.exam01_method_declaration.Calculator;

//매개변수 타입과 매개값의 관계 파악.
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int result1 = myCalc.plus(10,20);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 4;
        //byte는 int로 자동타입변환이 된다.
        double result2 = myCalc.divide(x,y);
        System.out.println("result2: " + result2);
    }
}
