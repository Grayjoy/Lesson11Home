import java.util.Arrays;
import java.util.List;

public class Main {

    private static Fruit lemon;
    private static Fruit apple;
    private static Fruit banana;
    private static Fruit apple1;

    private static final double KILLO = 1000;

    public static void main(String[] args) {

        lemon = new Lemon(FruitType.LEMON, FruitColor.YELLOW, 50, 49.99);
        apple = new Apple(FruitType.APPLE, FruitColor.GREEN, 200, 80.25);
        banana = new Banana(FruitType.BANANA, FruitColor.YELLOW, 450, 20.99);
        apple1 = new Apple(FruitType.APPLE, FruitColor.RED, 550, 30.80);

        List<Fruit> fruits = Arrays.asList(lemon, apple, banana, apple1);
        for (Fruit d : fruits) {
            d.propertirs();
        }
        weight();
        price();
    }

    public static void weight() {
        int sum = lemon.getWeight() + apple.getWeight() + banana.getWeight() + apple1.getWeight();
        System.out.println("\nWeight fruits: " + sum);
    }

    public static void price() {
        double priceLemon = lemon.getPrice() / KILLO * lemon.getWeight();
        double priceApple = apple.getPrice() / KILLO * apple.getWeight();
        double priceBanana = banana.getPrice() / KILLO * banana.getWeight();
        double priceApple1 = apple1.getPrice() / KILLO * apple1.getWeight();

        double sum = priceLemon + priceApple + priceBanana + priceApple1;

        System.out.println("\nTotal amount: " + sum + "$");
    }

}
