public class Dosen extends Entity {
    public Dosen(String namaDosen, String kodeDosen) {
        super(namaDosen, kodeDosen);
    }

    @Override
    public String getInfo() {
        return "Dosen: " + nama + " (" + kode + ")";
    }
}
