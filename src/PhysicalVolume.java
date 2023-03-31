import java.util.ArrayList;

public class PhysicalVolume extends Identification {

    private PhysicalHardDrive SD;

    public PhysicalVolume(String name, PhysicalHardDrive SD) {
        super(name);
        this.SD = SD;
    }

    public PhysicalHardDrive getSD() {
        return SD;
    }

    public static void printList(ArrayList<PhysicalVolume> list) {
        for (PhysicalVolume i : list) {
            System.out.println(i.getName() + ": [" + i.getSD().getSize() + "G] [" + i.getUUID() + "]");
        }
    }
}
