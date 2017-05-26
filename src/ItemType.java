/**
 * Created by Magda on 11.04.2017.
 */
public class ItemType {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    String name;
    int n;
    @Override
    public String toString() {
        return "ItemType{" +
                "name='" + name + '\'' +
                ", n=" + n +
                '}';
    }



    public ItemType(String name, int n) {
        this.name = name;
        this.n = n;
    }


}
