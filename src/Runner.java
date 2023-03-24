import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        String input = "";
        Scanner s = new Scanner(System.in);
        while (!input.equals("exit")) {
            System.out.print("cmd#: ");
            input = s.nextLine();
            if (input.substring(0, 6).equals("vglist")) {

            } else if (input.substring(0, 6).equals("pvlist")) {
                PhysicalVolume.printList(LVMStore.getPhysicalVolumeList());
            } else if (input.substring(0, 6).equals("lvlist")) {

            } else if (input.substring(0, 8).equals("lvcreate")) {

            } else if (input.substring(0, 8).equals("pvcreate")) {
                String name = input.substring(9, 9 + input.substring(input.indexOf(" ") + 1).indexOf(" "));
                String drive = input.substring(10 + name.length());
                for (int i = 0; i < LVMStore.getHardDriveList().size(); i++) {
                    PhysicalHardDrive check = LVMStore.getHardDriveList().get(i);
                    if (check.getName().equals(drive)) {
                        PhysicalVolume PV = new PhysicalVolume(name, check);
                        LVMStore.addPhysicalVolume(PV);
                        System.out.println("PhysicalVolume " + PV.getName() + " created");
                    }
                }
            } else if (input.substring(0, 8).equals("vgcreate")) {
                String name = input.substring(9, 9 + input.substring(input.indexOf(" ") + 1).indexOf(" "));
                String pv = input.substring(10 + name.length());
                for (int i = 0; i < LVMStore.getPhysicalVolumeList().size(); i++) {
                    PhysicalVolume check = LVMStore.getPhysicalVolumeList().get(i);
                    if (check.getName().equals(pv)) {
                        VolumeGroup VG = new VolumeGroup(name, check);
                        LVMStore.addVolumeGroup(VG);
                        System.out.println("VolumeGroup " + VG.getName() + " created");
                    }
                }
            } else if (input.substring(0, 8).equals("vgextend")) {
                String name = input.substring(9, 9 + input.substring(input.indexOf(" ") + 1).indexOf(" "));
                String pv = input.substring(10 + name.length());
                VolumeGroup vgActual;
                PhysicalVolume pvActual;
                for (int i = 0; i < LVMStore.getVolumeGroupList().size(); i++) {
                    VolumeGroup check = LVMStore.getVolumeGroupList().get(i);
                    if (check.getName().equals(name)) {
                        vgActual = check;
                    }
                }
                for (int i = 0; i < LVMStore.getPhysicalVolumeList().size(); i++) {
                    PhysicalVolume check = LVMStore.getPhysicalVolumeList().get(i);
                    if (check.getName().equals(pv)) {
                        pvActual = check;
                    }
                }
                vgActual.addPhysicalVolume(pvActual);
            } else if (input.substring(0, 11).equals("list-drives")) {
                PhysicalHardDrive.printList(LVMStore.getHardDriveList());
            } else if (input.substring(0, 13).equals("install-drive")) {
                String name = input.substring(14, 14 + input.substring(input.indexOf(" ") + 1).indexOf(" "));
                int size = Integer.parseInt(input.substring(15 + name.length()));
                PhysicalHardDrive drive = new PhysicalHardDrive(name, size);
                LVMStore.addHardDrive(drive);
                System.out.println("Drive " + drive.getName() + " installed");
            }
        }
    }
}
