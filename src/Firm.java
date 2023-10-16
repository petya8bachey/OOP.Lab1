import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;

public class Firm {
    String name;//Наименование фирмы
    String country;//Страна
    String region;//Регион (область)
    String town;//Городf
    String street;//Улица
    String postInx;//Почтовый индекс
    Date dateIn;//Дата ввода фирмы (начало взаимоотношений)
    String email;//Почтовый адрес фирмы
    String web;//URL-адрес сайта
    ArrayList<SubFirm> sbFirms;//Подразделения фирмы
    Dictionary<String, String> usrFields;//Пользовательские поля

    public void addCont() {}
    public void addContToSubFirm() {}
    public void addField(String name, String description) {
        usrFields.put(name, description);
    }
    public void addSubFirm(SubFirm subFirm) {
        sbFirms.add(subFirm);
    }
    public void existContact() {}
    public Firm() {}
    public String getFields(String name) {
        return usrFields.get(name);}
    public Object getMain() {return null;}
    public void renameField() {}
    public void setField() {}
}
