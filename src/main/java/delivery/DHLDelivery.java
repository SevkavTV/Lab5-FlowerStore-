package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDelivery implements Delivery{

    @Override
    public String deliver(List<Item> items) {
        return "The items will be delivered by DHL!";
    }
}
