package main;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ContType {
    String name;
    String note;
    public ContType() {}
    public ContType(String name, String note) {
        this.name = name;
        this.note = note;
    }
}
