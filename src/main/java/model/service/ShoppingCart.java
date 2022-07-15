package model.service;

import model.Food;


public class ShoppingCart {
    public Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = new Food[food.length];
        for (int i = 0; i < food.length; i++) {
            this.food[i] = food[i];
        }
    }

    public double Total(Food[] food) {
        double total = 0;
        for (int i = 0; i < food.length; i++) {
            total += food[i].getPrice() * food[i].getAmount();
        }
        return total;
    }

    public double TotalDiscount(Food[] food) {
        double discount = 0;
        for (int i = 0; i < food.length; i++) {
            discount += (food[i].getPrice() * food[i].getAmount()) * (100 - food[i].getDiscount()) / 100;
        }
        return discount;
    }

    public double TotalVegetarian(Food[] food) {
        double vegetarian = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian())
                vegetarian += food[i].getPrice() * food[i].getAmount();
        }
        return vegetarian;
    }
}
