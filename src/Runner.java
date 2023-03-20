import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("cmd#: ");
        String input = s.nextLine();
        if (input.substring(0, 6).equals("vglist")) {

        } else if (input.substring(0, 6).equals("pvlist")) {

        } else if (input.substring(0, 6).equals("lvlist")) {

        } else if (input.substring(0, 8).equals("lvcreate")) {

        } else if (input.substring(0, 8).equals("pvcreate")) {

        } else if (input.substring(0, 8).equals("vgcreate")) {

        } else if (input.substring(0, 13).equals("vgextend")) {

        } else if (input.substring(0, 11).equals("list-drives")) {

        } else if (input.substring(0, 13).equals("install-drive")) {
            String name = input.substring(input.indexOf(" ")).substring(0, input.indexOf(" "));
            int size
            PhysicalHardDrive test = new PhysicalHardDrive(name, )
        }
    }
}
