import java.util.ArrayList;
public class PhysicalHardDrive extends Identification {
    private int size;

    public PhysicalHardDrive(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void printList(ArrayList<PhysicalHardDrive> list) {
        for (PhysicalHardDrive i : list) {
            System.out.println(i.getName() + " " + i.getSize() + "G " + i.getUUID());
        }
    }
}
