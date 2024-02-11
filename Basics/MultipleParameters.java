public class MultipleParameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        myMethod("Shikha", 20);
        myMethod("Shubhi", 24);
    }
}