package main.firm;

import java.util.HashMap;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import main.subfirm.SubFirm;

@Setter
@Getter
public class FirmFactory {
    private static class SingletonHolder {
        public static final FirmFactory HOLDER_INSTANCE = new FirmFactory();
    }
    public static FirmFactory getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    private FirmFactory() {}

    HashMap<String, String> flds = new HashMap<>();
    SubFirm nameMain;

    public Firm create() {
        return new Firm();
    }
    public Set<String> fldName(String name) {
        return flds.keySet();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}