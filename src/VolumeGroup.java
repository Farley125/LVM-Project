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


}
