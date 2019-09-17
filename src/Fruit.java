public class Fruit {

    private FruitType fruitType;
    private FruitColor fruitColor;
    private int weight;
    private double price;


    public Fruit(FruitType fruitType, FruitColor fruitColor, int weight, double price) {
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
        this.weight = weight;
        this.price = price;
    }

    public void propertirs() {
        System.out.println(toString());

    }


    @Override
    public String toString() {
        return "type: " + fruitType + ", color: " + fruitColor + ", weight: " + weight + ", price: " + price;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
