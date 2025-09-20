import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class DB {
    private Map<String, List<Jadwal>> jadwal = new HashMap<>();

    public DB() {
        initData();
    }

    private void initData() {
        // Senin
        List<Jadwal> senin = new ArrayList<>();
        senin.add(new Perkuliahan(
            new Matkul("Komputer Grafik", "M-001", 3),
            new Dosen("Yudi Widhiysana", "D-001"),
            "07:00 - 08:40"
        ));
        senin.add(new Perkuliahan(
            new Matkul("Komputer Grafik (Praktek)", "M-002", 1),
            new Dosen("Trisna Gelar A", "D-002"),
            "10:40 - 12:20"
        ));
        senin.add(new Perkuliahan(
            new Matkul("Matematika Diskrit 2", "M-003", 3),
            new Dosen("Setiadi Rachmat", "D-003"),
            "13:00 - 15:30"
        ));
        jadwal.put("Senin", senin);

        // Selasa
        List<Jadwal> selasa = new ArrayList<>();
        selasa.add(new Perkuliahan(
            new Matkul("Aljabar Linear", "M-004", 2),
            new Dosen("Nurjannah Syakrani", "D-004"),
            "07:00 - 08:40"
        ));
        selasa.add(new Perkuliahan(
            new Matkul("PRPL (Teori)", "M-005", 2),
            new Dosen("Santi Sundari", "D-005"),
            "13:00 - 14:40"
        ));
        selasa.add(new Perkuliahan(
            new Matkul("PBO", "M-006", 2),
            new Dosen("Zulkifli Arsyad", "D-006"),
            "14:40 - 16:40"
        ));
        jadwal.put("Selasa", selasa);

        // Rabu
        List<Jadwal> rabu = new ArrayList<>();
        rabu.add(new Perkuliahan(
            new Matkul("Basis Data", "M-007", 3),
            new Dosen("Ade Chandra", "D-007"),
            "07:00 - 08:40"
        ));
        rabu.add(new Perkuliahan(
            new Matkul("Proyek 3", "M-008", 4),
            new Dosen("Bambang Cholid Irawan", "D-008"),
            "13:00 - 18:20"
        ));
        jadwal.put("Rabu", rabu);

        // Kamis
        List<Jadwal> kamis = new ArrayList<>();
        kamis.add(new Perkuliahan(
            new Matkul("Basis Data (Praktek)", "M-009", 1),
            new Dosen("Muhammad Riza A", "D-009"),
            "07:00 - 09:30"
        ));
        kamis.add(new Perkuliahan(
            new Matkul("PRPL (Praktek)", "M-010", 2),
            new Dosen("Lukmannul Hakim F", "D-010"),
            "10:40 - 13:50"
        ));
        jadwal.put("Kamis", kamis);

        // Jumat
        List<Jadwal> jumat = new ArrayList<>();
        jumat.add(new Perkuliahan(
            new Matkul("PBO (Praktek)", "M-011", 1),
            new Dosen("Zulkifli Arsyad", "D-006"), // reuse dosen
            "07:00 - 09:30"
        ));
        jadwal.put("Jumat", jumat);
    }

    public List<Jadwal> getJadwalByHari(String hari) {
        return jadwal.getOrDefault(hari, new ArrayList<>());
    }
}
