package sec08.exam02_return;

public class Car {
    int gas; //초기값이 없으니 처음은 0으로 초기화된다.

    //위는 필드(속성) 아래는 메소드(동작)이다.
    //매개변수 이름과 필드의 이름이 동일한 경우 우선순위는 매개변수에있다. 필드에있는 gas를 변경할 것이기 때문에 this를 붙여 필드라는것을 알려주는것.

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas == 0){
            System.out.println("gas가 없습니다.");
            return (false);
        }
        System.out.println("gas가 있습니다.");
        return (true);
    }
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }
        }
    }
}
