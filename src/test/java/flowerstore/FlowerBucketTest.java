package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;

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

        flowerBucket = new FlowerBucket();
        List<FlowerPack> flowerPackList = new ArrayList<>();
        flowerPackList.add(flowerPackRoses);
        flowerPackList.add(flowerPackTulips);
        flowerPackList.add(flowerPackChamomiles);
        flowerBucket.setFlowerPacks(flowerPackList);
    }

    @Test
    void getPrice() {
        assertEquals(95, flowerBucket.getPrice());
    }

}