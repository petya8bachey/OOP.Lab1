package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FirmTest {
//    Firm firm = FirmFactory.create();
    private Contact contact;
    private SubFirm subFirm;
    private Firm actualFirm;
    private Firm expectedFirm;
    
    @BeforeEach
    public void setUp(){
        contact = new Contact();
        contact.setBeginDt(new Date());
        contact.setEndDt(new Date());
        contact.setDescr("descr");
        contact.setDataInfo("data info");
        ContType contType = new ContType("name", "note");
        contact.setTpy(contType);

        subFirm = new SubFirm();
        subFirm.setName("name");
        subFirm.setBossName("boss");
        subFirm.setOfcBossName("boss");
        subFirm.setTel("+79601313765");
        subFirm.setEmail("www@yandex.ru");
        SubFirmType subFirmType= new SubFirmType(true, "name");
        subFirm.setTpy(subFirmType);
        subFirm.getConts().add(contact);

        actualFirm = new Firm();
        actualFirm.setName("name");
        actualFirm.setCountry("country");
        actualFirm.setRegion("region");
        actualFirm.setTown("town");
        actualFirm.setStreet("street");
        actualFirm.setPostInx("000001");
        actualFirm.setDateIn(new Date());
        actualFirm.setEmail("www@yandex.ru");
        actualFirm.setWeb("www.gg.ru");
        ArrayList<SubFirm> sbFirms = new ArrayList<>();
        sbFirms.add(subFirm);
        actualFirm.setSbFirms(sbFirms);
        HashMap<String, String> usrFields = new HashMap<>();
        usrFields.put("name", "des");
        actualFirm.setUsrFields(usrFields);
        expectedFirm = actualFirm;
    }
    @Test
    void addCont() {
        expectedFirm.getMain().setConts(new ArrayList<>());
        expectedFirm.addCont(contact);
        assertEquals(expectedFirm, actualFirm);
    }

    @Test
    void addContToSubFirm() {
        expectedFirm.getMain().setConts(new ArrayList<>());
        expectedFirm.addContToSubFirm(subFirm, contact);
        assertEquals(expectedFirm, actualFirm);
    }

    @Test
    void addField() {
        expectedFirm.setUsrFields(new HashMap<>());
        expectedFirm.addField("name", "des");
        assertEquals(expectedFirm, actualFirm);
    }

    @Test
    void addSubFirm() {
        expectedFirm.setSbFirms(new ArrayList<>());
        expectedFirm.addSubFirm(subFirm);
        assertEquals(expectedFirm, actualFirm);
    }

    @Test
    void existContact() {
        assertEquals(actualFirm.existContact(contact), !actualFirm.existContact(new Contact()));
    }

    @Test
    void getFields() {
        assertEquals(expectedFirm.getFields("name"), actualFirm.getUsrFields().get("name"));
    }

    @Test
    void getMain() {
        assertEquals(expectedFirm.getMain(), subFirm);
    }

    @Test
    void renameField() {
        expectedFirm.renameField("name", "name");
        assertEquals(expectedFirm, actualFirm);
    }

    @Test
    void setField() {
        expectedFirm.setField("name", "value");
        actualFirm.getUsrFields().put("name", "value");
        assertEquals(expectedFirm, actualFirm);
    }
}