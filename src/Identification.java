import java.util.UUID;

public class Identification {

    private String name;
    private java.util.UUID UUID;

    public Identification(String name) {
        this.name = name;
        UUID = UUID.randomUUID();
    }
}
