import java.util.Scanner;
import java.util.List;

public class App {
    private DB data;
    private Scanner input;
    private Util util;

    public App() {
        data = new DB();
        input = new Scanner(System.in);
        util = new Util();
    }

    public void run() {
        while (true) {
            menu();
            String choice = inputHari();
            if (choice.equals("6") || choice.equalsIgnoreCase("Keluar")) {
                System.out.println("\nTerima kasih! Program selesai.\n");
                break;
            }

            String hari = konversiHari(choice);
            util.sleep(1);
            util.clearScreen();

            System.out.println("=== Jadwal Kuliah Hari " + hari + " ===");
            List<Jadwal> jadwalHari = data.getJadwalByHari(hari);

            if (jadwalHari.isEmpty()) {
                System.out.println("Tidak ada jadwal untuk hari ini.");
            } else {
                for (Jadwal item : jadwalHari) {
                    item.printInfo();
                }
            }
            System.out.println("====================================\n");
        }
    }

    public void menu() {
        System.out.println("Jadwal Perkuliahan");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Keluar");
    }

    public String inputHari() {
        System.out.print("Lihat Jadwal : ");
        return input.nextLine();
    }

    private String konversiHari(String choice) {
        switch (choice) {
            case "1": return "Senin";
            case "2": return "Selasa";
            case "3": return "Rabu";
            case "4": return "Kamis";
            case "5": return "Jumat";
            default:  return choice; // kalau langsung input nama hari
        }
    }
}
