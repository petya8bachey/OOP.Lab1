public class FirmFactory {
    Object flds;
    SubFirm nameMain;
    public static Firm create() {
        return new Firm();
    }
    public void fldName() {}
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Firm firm = create();
    }
}