import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

/**
 * TODO:
 * Fill this out later
 * @param <T>
 */
public class MyIterable<T> implements Iterable<T> {

    private List<T> list;
    public MyIterable(T [] t) {
        list = Arrays.asList(t);
        Collections.sort(list, Collections.reverseOrder());
    }

    @Override
    public Iterator<T> iterator() { return list.iterator(); }
}