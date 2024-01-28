public class ConstructorClass {
    int x;
    public ConstructorClass() {
        x = 18;
    }
    public static void main(String[] args) {
        ConstructorClass obj = new ConstructorClass();
        System.out.println(obj.x);
    }
}