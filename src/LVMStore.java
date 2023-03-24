import java.util.ArrayList;
public class LVMStore {
    private static ArrayList<VolumeGroup> VolumeGroupList = new ArrayList<VolumeGroup>();
    private static ArrayList<PhysicalVolume> PhysicalVolumeList = new ArrayList<PhysicalVolume>();
    private static ArrayList<PhysicalHardDrive> HardDriveList = new ArrayList<PhysicalHardDrive>();
    private static ArrayList<LogicalVolume> LogicalVolumeList = new ArrayList<LogicalVolume>();

    public static void addVolumeGroup(VolumeGroup add) {
        VolumeGroupList.add(add);
    }

    public static void addPhysicalVolume(PhysicalVolume add) {
        PhysicalVolumeList.add(add);
    }

    public static void addHardDrive(PhysicalHardDrive add) {
        HardDriveList.add(add);
    }

    public static void addLogicalVolume(LogicalVolume add) {
        LogicalVolumeList.add(add);
    }

    public static ArrayList<VolumeGroup> getVolumeGroupList() {
        return VolumeGroupList;
    }

    public static ArrayList<PhysicalVolume> getPhysicalVolumeList() {
        return PhysicalVolumeList;
    }

    public static ArrayList<PhysicalHardDrive> getHardDriveList() {
        return HardDriveList;
    }

    public static ArrayList<LogicalVolume> getLogicalVolumeList() {
        return LogicalVolumeList;
    }
}
