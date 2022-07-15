package model;

import model.constants.Colour;
import model.constants.Discount;

public class Meat extends Food {

    public Meat(int amount, double price) {
        setAmount(amount);
        setPrice(price);
        setVegetarian(false);
    }
    @Override
    public double getDiscount() {
 return 0;
    }
}
