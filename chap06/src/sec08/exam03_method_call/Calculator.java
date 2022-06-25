package sec08.exam03_method_call;
// 클래스 내부에 선언된 메소드를 내부의 메소드에서 선언 시 이름만으로 호출이 가능하다.
public class Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return (result);
    }

    double avg(int x, int y)
    {
        double sum = plus(x, y);
        double result = sum / 2;
        return (result);
    }

    void execute()
    {
        double result = avg(7, 10);
        println("실행결과: " + result);
    }

    void println(String message)
    {
        System.out.println(message);
    }
}
