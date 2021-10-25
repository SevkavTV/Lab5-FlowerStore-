package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerStore {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public List<FlowerBucket> search(double price, List<FlowerType> flowerTypes){
        List<FlowerBucket> suitableBuckets = new ArrayList<>();
        for (FlowerBucket flowerBucket: flowerBuckets) {
            boolean suitable = true;
            for (FlowerPack flowerPack: flowerBucket.getFlowerPacks()) {
                if (!flowerTypes.contains(flowerPack.getFlower().getFlowerType())){
                    suitable = false;
                    break;
                }
            }
            if (suitable && flowerBucket.getPrice() <= price) {
                suitableBuckets.add(flowerBucket);
            }
        }

        return suitableBuckets;
    }
}
