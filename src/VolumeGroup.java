import java.util.ArrayList;
public class VolumeGroup extends Identification {
    private ArrayList<PhysicalVolume> listOfPVolumes;
    private ArrayList<LogicalVolume> listOfLVolumes;

    public VolumeGroup(String name, PhysicalVolume pVolume) {
        super(name);
        listOfPVolumes.add(pVolume);
    }

    public void addPhysicalVolume(PhysicalVolume pVolume) {
        listOfPVolumes.add(pVolume);
    }
}
