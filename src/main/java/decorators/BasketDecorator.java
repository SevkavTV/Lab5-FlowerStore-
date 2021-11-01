package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    private static int basketPrice = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + basketPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in a basket!";
    }
}
