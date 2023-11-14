package main;

import java.util.HashMap;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class FirmFactory {
    HashMap<String, String> flds = new HashMap<>();
    SubFirm nameMain;
    public static Firm create() {
        return new Firm();
    }
    public Set<String> fldName(String name) {
        return flds.keySet();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Firm firm = create();
    }
}