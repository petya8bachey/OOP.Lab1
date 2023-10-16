import java.util.ArrayList;

public class ContTypeCol<Contact> {
    ArrayList<Contact> lst = new ArrayList<>();
    public void add(Contact contact) {
        lst.add(contact);
    }
    public void clear() {
        lst.clear();
    }
    public ContTypeCol() {
    }
}
