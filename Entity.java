public abstract class Entity {
    protected String nama;
    protected String kode;

    public Entity(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    // Method abstrak untuk diturunkan
    public abstract String getInfo();
}
