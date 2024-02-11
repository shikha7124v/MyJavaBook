public class IfElseMethod {
    static void checkAge(int age) {
        if(age < 18) {
            System.out.println("Under Age");
        }
        else {
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}