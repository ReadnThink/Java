package sec10.exam04_singleton;

public class SingletonExample {
    public static void main(String[] args) {
       // Singleton obj1 = new Singleton();
       // Singleton obj2 = new Singleton();

        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if (obj1 == obj2) {
            System.out.println("Same obj.");
        } else {
            System.out.println("different obj.");
        }
    }
}
