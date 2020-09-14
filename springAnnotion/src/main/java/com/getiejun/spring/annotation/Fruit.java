package com.getiejun.spring.annotation;

public class Fruit {

    @FruitName("Apple")
    private String fruitName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String fruitColor;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    @Deprecated
    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                '}';
    }
}
