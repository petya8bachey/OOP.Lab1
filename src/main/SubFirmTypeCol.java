package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SubFirmTypeCol implements Iterable<SubFirmType> {
    ArrayList<SubFirmType> lst;
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
    public SubFirmTypeCol() {}
}
