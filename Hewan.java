// Ini adalah implementasi {Interface} dari kode program HewanApp

public abstract class Hewan implements IPerilakuHewan {
    private String nama ;
    private int umur;
    public final String Type;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.Type = "Hewan";
    }

    public abstract void suaraHewan();

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public abstract String getType();

}
