package main;

import java.util.Dictionary;
import java.util.Enumeration;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class FirmFactory {
    Dictionary<String, String> flds;
    SubFirm nameMain;
    public static Firm create() {
        return new Firm();
    }
    public Enumeration<String> fldName(String name) {
        return flds.keys();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Firm firm = create();
    }
}