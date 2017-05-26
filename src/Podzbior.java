import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Magda on 02.05.2017.
 */
public class Podzbior {
    private int n;

    public Podzbior(int n) {
        this.n = n;

    }

    public void generuj(LinkedList<Item> l) {

        for (int i = 0; i <= n; i++)
            podzbiory(l, i, n, 1);

    }


    void podzbiory(LinkedList<Item> l, int n, int k, int m) //l - stos na którym mamy aktualne elementy podzbioru, n-ile jeszcze mamy dołożyć, k- maksymalna wartość elementu który możemy dołozyć, m- minimalna wartość
    {
        if (n == 0)
            System.out.println(l.toString());//wypisanie całej zawartości stosu
        else
            for (int i = m; i <= k; i++) {
                Item it = l.get(i);
                l.removeLast();

                podzbiory(l, n - 1, k, i + 1);
                l.addLast(it);
            }
    }
}
