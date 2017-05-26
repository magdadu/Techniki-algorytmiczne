/**
 * Created by Magda on 11.04.2017.
 */
public class Item {

    int id;
    int w;
    int c;
    ItemType itemType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public Item(int id, int w, int c, ItemType itemType) {
        this.id = id;
        this.w = w;
        this.c = c;
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", w=" + w +
                ", c=" + c +
                ", itemType=" + itemType +
                '}' + '\n';
    }

}
