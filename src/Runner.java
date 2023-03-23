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

            } else if (input.substring(0, 6).equals("lvlist")) {

            } else if (input.substring(0, 8).equals("lvcreate")) {

            } else if (input.substring(0, 8).equals("pvcreate")) {

            } else if (input.substring(0, 8).equals("vgcreate")) {

            } else if (input.substring(0, 13).equals("vgextend")) {

            } else if (input.substring(0, 11).equals("list-drives")) {
                PhysicalHardDrive.printList();
            } else if (input.substring(0, 13).equals("install-drive")) {
                String name = input.substring(14, 14 + input.substring(input.indexOf(" ") + 1).indexOf(" "));
                int size = Integer.parseInt(input.substring(15 + name.length()));
                PhysicalHardDrive test = new PhysicalHardDrive(name, size);
            }
        }
    }
}
