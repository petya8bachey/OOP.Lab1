package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Firm extends  FirmFactory{
    String name;//Наименование фирмы
    String country;//Страна
    String region;//Регион (область)
    String town;//Город
    String street;//Улица
    String postInx;//Почтовый индекс
    Date dateIn;//Дата ввода фирмы (начало взаимоотношений)
    String email;//Почтовый адрес фирмы
    String web;//URL-адрес сайта
    ArrayList<SubFirm> sbFirms;//Подразделения фирмы
    HashMap<String, String> usrFields;//Пользовательские поля
    public Firm() {
        sbFirms = new ArrayList<>();
    }
    public void addCont(Contact contact) {
        getMain().addCont(contact);
    }
    public void addContToSubFirm(SubFirm subFirm, Contact contact) {
        subFirm.addCont(contact);
    }
    public void addField(String name, String description) {
        usrFields.put(name, description);
    }
    public void addSubFirm(SubFirm subFirm) {
        sbFirms.add(subFirm);
    }
    public boolean existContact(Contact contact) {
        for (SubFirm subFirm:sbFirms) {
            if(subFirm.existContact(contact)) {
                return true;
            }
        }
        return false;
    }
    public String getFields(String name) {
        return usrFields.get(name);}
    public SubFirm getMain() {
        for (SubFirm subFirm:sbFirms) {
            if(subFirm.tpy.isMain) {
                return subFirm;
            }
        }
        return null;}
    public void renameField(String oldName, String newName) {
        String value = getFields(oldName);
        usrFields.remove(oldName);
        super.flds.remove(newName);
        usrFields.put(newName, value);
        super.flds.put(newName, value);
    }
    public void setField(String name, String value) {
        usrFields.put(name, value);
        super.flds.put(name, value);
    }
}
