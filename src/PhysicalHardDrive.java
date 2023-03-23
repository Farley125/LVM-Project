import java.util.ArrayList;
public class PhysicalHardDrive extends Identification {
    private int size;
    private static ArrayList<PhysicalHardDrive> list = new ArrayList<PhysicalHardDrive>();

    public PhysicalHardDrive(String name, int size) {
        super(name);
        this.size = size;
        list.add(this);
    }

    public int getSize() {
        return size;
    }

    public static void printList() {
        for (PhysicalHardDrive i : list) {
            System.out.println(i.getName() + " " + i.getSize() + "G " + i);
        }
    }
}
