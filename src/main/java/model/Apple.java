package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.colour = colour;
        setAmount(amount);
        setPrice(price);
        setVegetarian(true);
    }

    @Override
    public double getDiscount() {
        if (colour == Colour.RED) {
            return Discount.appleRedDiscount;
        }
        if (colour == Colour.GREEN) {
            return Discount.appleGreenDiscount;
        } else return 0;
    }
}
