package decorators;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    private static int ribbonPrice = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + ribbonPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with a ribbon!";
    }
}
