package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator {
    private static int paperPrice = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + paperPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " covered with paper!";
    }
}
