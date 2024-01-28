//final and abstract are non access modifier

class Main extends Vechile {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Main car = new Main();
        car.honk();
        System.out.println(car.brand + " "+car.modelName);
    }
}