package main;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SubFirm {
    String name;//Наименование подразделения
    String bossName;//Имя руководителя подразделения
    String ofcBossName;//Официальное обращение к руководителю
    String tel;//номер телефона подразделения
    String email;//Почтовый адрес подразделения
    SubFirmType tpy;//Тип подразделения
    ArrayList<Contact> conts;//Контакты подразделения
    public void addCont(Contact contact) {
        conts.add(contact);
    }
    public boolean existContact(Contact contact) {
        for (Contact cnt:conts) {
            if(cnt == contact){
                return true;
            }
        }
        return false;
    }
    public SubFirmType isYourType() {
        return tpy;
    }
    public SubFirm() {}
}
