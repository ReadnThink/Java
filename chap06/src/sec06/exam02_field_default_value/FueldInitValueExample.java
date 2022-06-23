package sec06.exam02_field_default_value;
// 초기값으 선언되지 않았을떄의 값 출력 (도트 (.)를 통해서 클래스 필드에 접근하였다.
public class FueldInitValueExample {
    public static void main(String args[]){
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField: " + fiv.byteField);
        System.out.println("shortField: " + fiv.shortField);
        System.out.println("intField: " + fiv.intField);
        System.out.println("longField: " + fiv.longField);

        System.out.println("booleanField: " + fiv.booleanField);
        System.out.println("charField: " + fiv.charField);

        System.out.println("floatField: " + fiv.floatField);
        System.out.println("doubleField: " + fiv.doubleField);

        System.out.println("arrField: " + fiv.arrField);
        System.out.println("referenceField: " + fiv.referenceField);

        //변경방법 = 도트를 통하여 변경
        fiv.intField = 60;
        System.out.println("intField: " + fiv.intField);
    }
}
