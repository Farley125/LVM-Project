public class LogicalVolume extends PhysicalHardDrive {

    private VolumeGroup associatedGroup;

    public LogicalVolume(String name, int size, VolumeGroup group) {
        super(name, size);
        associatedGroup = group;
    }
}
