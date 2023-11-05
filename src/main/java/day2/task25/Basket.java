package day2.task25;


public class Basket {
    private int totalItems = 0;

    public void addToBasket()throws BasketFullException{
        if(totalItems == 10){
            throw new BasketFullException("Too many items in the basket");
        }
        totalItems++;
    }

    public void removeFromBasket() throws BasketEmptyException{
        if (totalItems == 0){
            throw new BasketEmptyException("Cannot remove from an empty basket");
        }
        totalItems--;
    }
}
