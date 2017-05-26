/**
 * Created by Magda on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        AvailableItems availableItems = new AvailableItems(5);
        Rucksack rucksack = new Rucksack();
        System.out.println("Dostepne rzeczy przed dyskretyzacja");
        availableItems.printAvailableItems();
        System.out.println("Dostepne rzeczy po dyskretyzacji");
        System.out.println(availableItems.discretise());
    }
}
