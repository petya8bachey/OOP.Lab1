package main.subfirm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import lombok.Getter;
import lombok.Setter;
import main.contact.ContTypeCol;

@Setter
@Getter
public class SubFirmTypeCol implements Iterable<SubFirmType> {

    private static final class InstanceHolder {
        public static final SubFirmTypeCol INSTANCE = new SubFirmTypeCol();
    }

    public static SubFirmTypeCol getInstance() {
        return InstanceHolder.INSTANCE;
    }
    ArrayList<SubFirmType> lst = new ArrayList<>();
    Iterator<SubFirmType> iter = lst.iterator();

    @Override
    public Iterator<SubFirmType> iterator() {
        return iter;
    }
    public void add(SubFirmType subFirmType) {
        lst.add(subFirmType);
    }
    public void dispose() {}
    public boolean hasNext() {
        return iter.hasNext();
    }
    public SubFirmType next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return iter.next();
    }
    public void reset() {
        iter = lst.iterator();
    }
    private SubFirmTypeCol() {}
}
