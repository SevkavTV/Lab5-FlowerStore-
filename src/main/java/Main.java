import decorators.PaperDecorator;
import flowerstore.FlowerBucket;
import flowerstore.Item;

public class Main {
    public static void main(String[] args) {
        Item bucket = new FlowerBucket();
        bucket = new PaperDecorator(bucket);
    }
}
