package main;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SubFirmType {
    boolean isMain;
    String name;
    public SubFirmType(Boolean isMain, String name) {
        this.isMain = isMain;
        this.name = name;
    }
}
