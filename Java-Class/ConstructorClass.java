public class ConstructorClass {
    int x;
    public ConstructorClass() {
        x = 18;
    }
    //Parameterised Constructor
    public ConstructorClass(int y) {
        x = y;
    }
    public static void main(String[] args) {
        ConstructorClass obj = new ConstructorClass();
        System.out.println(obj.x);
        ConstructorClass obj1 = new ConstructorClass(5);
        System.out.println(obj1.x);
    }
}