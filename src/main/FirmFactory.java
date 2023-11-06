package main;

public class FirmFactory {
    String flds;
    SubFirm nameMain;
    public static Firm create() {
        return new Firm();
    }
    public void fldName(String name) {
        flds = name;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Firm firm = create();
    }
}