package main.contact;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Contact {
    Date beginDt; //Дата начала контакта
    Date endDt; //Дата завершения контакта
    String descr; //Описание контакта для себя
    String dataInfo; //Формулировка контакта для клиента
    ContType tpy; //Вид контакта

    public Contact() {    }
    public Contact clone() {
        Contact contact = new Contact();
        contact.beginDt = beginDt;
        contact.endDt = endDt;
        contact.descr = descr;
        contact.dataInfo = dataInfo;
        contact.tpy = tpy;
        return contact;
    }

}
