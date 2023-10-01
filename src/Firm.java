import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;

public class Firm {
    String name; //Наименование фирмы
    String country;//Страна
    String region;//Регион (область)
    String town;//Город
    String street;//Улица
    String postInx;//Почтовый индекс
    Date dateIn;//Дата ввода фирмы (начало взаимоотношений)
    String email;//Почтовый адрес фирмы
    String web;//URL-адрес сайта
    ArrayList<SubFirm> sbFirms;//Подразделения фирмы
    Dictionary<String, String> usrFields;//Пользовательские поля

}
