package flower.item;

import lombok.Getter;
import lombok.Setter;

@Setter 
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public Flower() {
        color = FlowerColor.RED;
        flowerType = FlowerType.ROSE;
    }

    public Flower(
    double sepalLength,
    FlowerColor color,
    double price,
    FlowerType flowerType)
    {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
}
