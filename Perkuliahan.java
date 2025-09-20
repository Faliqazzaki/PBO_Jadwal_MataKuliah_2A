public class Perkuliahan extends Jadwal implements IDeskripsi {

    public Perkuliahan(Matkul matkul, Dosen dosen, String jam) {
        super(matkul, dosen, jam);
    }

    @Override
    public void printInfo() {
        System.out.println(jam + " | " + matkul.getKode() + " | " + matkul.getNama() + " | " + matkul.getSks() + " SKS | " + dosen.getNama());
    }

    @Override
    public String getDeskripsi() {
        return "Jadwal Perkuliahan: " + matkul.getNama() + " oleh Dosen " + dosen.getNama() + " pada " + jam;
    }
}