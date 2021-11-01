package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    @Override
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        String desc = "Here is a flower bucket:\n";
        for (FlowerPack flowerPack : flowerPacks) {
            desc += flowerPack.getDescription() + "\n";
        }

        return desc;
    }
}
