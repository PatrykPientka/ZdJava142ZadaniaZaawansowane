package day2.task25;

public class Task25 {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            basket.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println(e);
        }

    }
}
