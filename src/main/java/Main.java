import model.Food;
import model.constants.Colour;
import model.service.ShoppingCart;
import model.Apple;
import model.Meat;


public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);
        Food[] meal = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(meal);

        System.out.println("Общая сумма всех товаров: " + cart.Total(meal) + ".");
        System.out.println("Сумма скидки для всей корзины: " + cart.TotalDiscount(meal) + ".");
        System.out.println("Сумма всех вегетерианских продуктов: " + cart.TotalVegetarian(meal) + ".");

    }

}
