import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Magda on 11.04.2017.
 */
public class AvailableItems {
    public LinkedList<Item> availbaleItems;
    private int numberOfAvailableItems;

    public LinkedList<Item> getAvailbaleItems() {
        return availbaleItems;
    }

    public void setAvailbaleItems(LinkedList<Item> availbaleItems) {
        this.availbaleItems = availbaleItems;
    }

    public int getNumberOfAvailableItems() {
        return numberOfAvailableItems;
    }

    public void setNumberOfAvailableItems(int numberOfAvailableItems) {
        this.numberOfAvailableItems = numberOfAvailableItems;
    }


    public AvailableItems(int numberOfAvailableItems) {//3
        this.availbaleItems = new LinkedList<>();
        this.numberOfAvailableItems = numberOfAvailableItems;
        generate();
    }

    private void generate() {
        int randomNum = 0;
        int randomNum2 = 0;
        Random random = new Random();
        int id = 1;
        for (int i = 1; i <= numberOfAvailableItems; i++) { //3petle
            randomNum = ThreadLocalRandom.current().nextInt(0, 15);
            randomNum2 = ThreadLocalRandom.current().nextInt(0, 25);
            Item item = new Item(id, randomNum, randomNum2, new ItemType("Item" + i, ThreadLocalRandom.current().nextInt(1, 5)));
            availbaleItems.add(item);
            id++;
        }

    }

    public LinkedList<Item> discretise() {//dyskretyzajcia(?)
        int size = availbaleItems.size();//3
        for (int i = 0; i < size; i++) {//iteracja 3x
            Item item = availbaleItems.get(i);
            if (item.getItemType().getN() > 1) {
                for (int j = 1; j < item.getItemType().getN(); j++) {

                    availbaleItems.addLast(new Item(availbaleItems.size() + 1, item.getW(), item.getC(), new ItemType(item.getItemType().getName(), 1)));
                }
                item.getItemType().setN(1);
            }

        }

        return availbaleItems;
    }


    public void printAvailableItems() {
        for (Item i : availbaleItems)
            System.out.println(i);
    }


}
