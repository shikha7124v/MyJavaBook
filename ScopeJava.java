public class ScopeJava {
    public static void main(String[] args) {
        //Block Scope
        int x = 200;
        System.out.println(x);
        {
            int y = 100;
            System.out.println(y);
        }
        System.out.println(x);
    }
}