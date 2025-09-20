public abstract class Jadwal {
    protected Matkul matkul;
    protected Dosen dosen;
    protected String jam;

    public Jadwal(Matkul matkul, Dosen dosen, String jam) {
        this.matkul = matkul;
        this.dosen = dosen;
        this.jam = jam;
    }

    
    public abstract void printInfo();
}
