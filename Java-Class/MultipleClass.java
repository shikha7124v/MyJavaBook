public class MultipleClass {
    MultipleClass() {
        System.out.println("Multiple Class");
    }
    void method() {
        System.out.println("Method");
    }
    public static void main(String[] args) {
        MultipleClass obj1 = new MultipleClass();
        Second obj2 = new Second();
        obj1.method();
        obj2.method2();
    }
}
class Second {
    Second() {
        System.out.println("Second");
    }
    void method2() {
        System.out.println("Method2");
    }
}