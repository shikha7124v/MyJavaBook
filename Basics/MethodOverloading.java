public class MethodOverloading {
    static int method(int x, int y) {
        return x+y;
    }
    static double method(double x, double y) {
        return x+y;
    }
    public static void main(String[] args) {
        int myNum1 = method(2,3);
        double myNum2 = method(2.00, 3.00);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}