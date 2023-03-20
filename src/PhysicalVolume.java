public class PhysicalVolume extends Identification {

    private PhysicalHardDrive SD;

    public PhysicalVolume(String name, PhysicalHardDrive SD) {
        super(name);
        this.SD = SD;
    }

}
