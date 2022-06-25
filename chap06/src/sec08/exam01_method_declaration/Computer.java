package sec08.exam01_method_declaration;
// 배열을 만들어 매개값을 받는다.
public class Computer {
    public int sum1(int[] values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return (sum);
    }
// ...을 활용하여 배열을 만들지 않고 컴퓨터가 배열을 만들게 한다.
    int sum2(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return (sum);
    }
}
