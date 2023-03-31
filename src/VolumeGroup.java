import java.util.ArrayList;
public class VolumeGroup extends Identification {
    private ArrayList<PhysicalVolume> listOfPVolumes = new ArrayList<PhysicalVolume>();
    private ArrayList<LogicalVolume> listOfLVolumes = new ArrayList<LogicalVolume>();

    public VolumeGroup(String name, PhysicalVolume pVolume) {
        super(name);
        listOfPVolumes.add(pVolume);
    }

    public void addPhysicalVolume(PhysicalVolume pVolume) {
        listOfPVolumes.add(pVolume);
    }

    public static void printList(ArrayList<VolumeGroup> list) {
        for (VolumeGroup i : list) {
            int size = 0;
            for (PhysicalVolume pv : i.listOfPVolumes) {
                size += pv.getSD().getSize();
            }
            System.out.println(i.getName() + ": " + size + "G " + i.getUUID());
        }
    }
}
