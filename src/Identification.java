import java.util.UUID;

public class Identification {

    private String name;
    private java.util.UUID UUID;

    public Identification(String name) {
        this.name = name;
        UUID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public java.util.UUID getUUID() {
        return UUID;
    }
}
