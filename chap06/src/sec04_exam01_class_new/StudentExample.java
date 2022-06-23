package sec04_exam01_class_new;

public class StudentExample {
    public static void main(String[] args){
        Student s1 = new Student(); //new연산자가 생성자를 호출해서 heap영역할당 후 s1에 heap 메모리 위치 저장
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

    }
}
