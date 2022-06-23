package sec06.exam02_field_default_value;
//초기값을 셋팅하지 않을경우 어떻게 초기화 되는지 확인.
public class FieldInitValue {
    // 정수타입 = 0으로 초기화
    byte byteField;
    short shortField;
    int intField;
    long longField;
    //불리언 = false, char = 아스키코드 0
    boolean booleanField;
    char charField;
    // 실수 = 0.0
    float floatField;
    double doubleField;

    //배열 = 참조타임 = null
    int[] arrField;
    String referenceField;
}
