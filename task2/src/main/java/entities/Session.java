package entities;

import lombok.Data;

@Data
public class Session {
    private int id;
    private Boolean isCame;
    private Boolean isIll;
    private Boolean isCompleted;
    private String description;

    public Session() {}

    public Session(int id, Boolean isCame, Boolean isIll, Boolean isCompleted, String description) {
        this.id = id;
        this.isCame = isCame;
        this.isIll = isIll;
        this.isCompleted = isCompleted;
        this.description = description;
    }
}
