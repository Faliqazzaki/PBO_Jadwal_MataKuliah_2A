public class Matkul extends Entity {
    private int sks;

    public Matkul(String namaMatkul, String kodeMatkul, int sksMatkul) {
        super(namaMatkul, kodeMatkul);
        this.sks = sksMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String getInfo() {
        return "Matkul: " + nama + " (" + kode + "), SKS: " + sks;
    }
}
