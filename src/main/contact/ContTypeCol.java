package main.contact;


import lombok.Getter;

import java.util.ArrayList;
@Getter
public class ContTypeCol {

    private static final class InstanceHolder {
        public static final ContTypeCol INSTANCE = new ContTypeCol();
    }

    public static ContTypeCol getInstance() {
        return InstanceHolder.INSTANCE;
    }
    ArrayList<ContType> lst = new ArrayList<>();
    public void add(ContType contType) {
        lst.add(contType);
    }
    public void clear() {
        lst.clear();
    }
    private ContTypeCol() {
    }
}
