public class Kendaraan {
    protected String merk;
    protected int kecepatan;

    // Overloading Constructor
    public Kendaraan() {
        this("Tidak diketahui", 0);
    }

    public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    // Setter dan Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Method yang bisa di override
    public String info() {
        return "Kendaraan Merk: " + merk + ", Kecepatan Maksimal: " + kecepatan + " km/jam";
    }
}
