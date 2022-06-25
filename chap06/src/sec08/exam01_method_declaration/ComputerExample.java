package sec08.exam01_method_declaration;

import sec08.exam01_method_declaration.Computer;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        //배열 직접 만들어 매개값에 대입
        int[]values1 = {1, 2, 3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1: " + result1);

        //매소드 호출과 동시에 배열 선언해 매개값에 대입
        int result2 = myCom.sum1(new int[] {1, 2, 3});
        System.out.println("result2: " + result2);

        //도트연산자 활용해서 배열안만들고 바로 매소드에 대입
        int result3 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println("result3: " + result3);
    }
}
