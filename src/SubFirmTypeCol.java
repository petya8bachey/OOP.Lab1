import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SubFirmTypeCol<T> implements Iterable<T> {
    T[] lst;
    int current = 0;
    @Override
    public Iterator<T> iterator() {
        return null;
    }
    public void add() {}
    public void dispose() {}
    public boolean hasNext() {
        if (current < lst.length) {
            return true;
        } else {
            return false;
        }
    }
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return lst[current++];
    }
    public void reset() {}
    public SubFirmTypeCol() {}
}
