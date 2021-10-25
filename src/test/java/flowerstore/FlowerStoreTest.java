package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {
    FlowerStore flowerStore;
    @BeforeEach
    void setUp() {
        Flower flowerRose = new Flower(FlowerType.ROSE);
        flowerRose.setPrice(15);
        flowerRose.setSepalLength(5.5);
        flowerRose.setColor(new int[]{127, 0, 0});
        FlowerPack flowerPackRoses = new FlowerPack(flowerRose, 3);

        Flower flowerTulip = new Flower(FlowerType.TULIP);
        flowerTulip.setPrice(10);
        flowerTulip.setSepalLength(3);
        flowerTulip.setColor(new int[]{126, 0, 0});
        FlowerPack flowerPackTulips = new FlowerPack(flowerTulip, 4);

        Flower flowerChamomile = new Flower(FlowerType.CHAMOMILE);
        flowerChamomile.setPrice(5);
        flowerChamomile.setSepalLength(1);
        flowerChamomile.setColor(new int[]{125, 0, 0});
        FlowerPack flowerPackChamomiles = new FlowerPack(flowerChamomile, 2);

        FlowerBucket flowerBucket1 = new FlowerBucket();
        FlowerBucket flowerBucket2 = new FlowerBucket();
        FlowerBucket flowerBucket3 = new FlowerBucket();

        List<FlowerPack> flowerPackList1 = new ArrayList<>();
        List<FlowerPack> flowerPackList2 = new ArrayList<>();
        List<FlowerPack> flowerPackList3 = new ArrayList<>();
        flowerPackList1.add(flowerPackRoses);
        flowerBucket1.setFlowerPacks(flowerPackList1);
        flowerPackList2.add(flowerPackRoses);
        flowerPackList2.add(flowerPackTulips);
        flowerBucket2.setFlowerPacks(flowerPackList2);
        flowerPackList3.add(flowerPackRoses);
        flowerPackList3.add(flowerPackTulips);
        flowerPackList3.add(flowerPackChamomiles);
        flowerBucket3.setFlowerPacks(flowerPackList3);

        flowerStore = new FlowerStore();
        List<FlowerBucket> flowerBuckets = new ArrayList<>();
        flowerBuckets.add(flowerBucket1);
        flowerBuckets.add(flowerBucket2);
        flowerBuckets.add(flowerBucket3);
        flowerStore.setFlowerBuckets(flowerBuckets);
    }

    @Test
    void search() {
        List<FlowerType> flowerTypes = new ArrayList<>();
        flowerTypes.add(FlowerType.ROSE);
        flowerTypes.add(FlowerType.TULIP);
        assertEquals(2, flowerStore.search(90, flowerTypes).size());
    }
}