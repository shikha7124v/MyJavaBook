public class ArrayJava {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[1]);
        cars[0] = "Audi";
        System.out.println(cars[0]);
        int len = cars.length;
        System.out.println(len);
    }
}