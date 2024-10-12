public class Mobil extends Kendaraan {
    private int kapasitasMesin; // dalam CC

    // Overloading Constructor
    public Mobil(String merk, int kecepatan, int kapasitasMesin) {
        super(merk, kecepatan); // Memanggil constructor induk
        this.kapasitasMesin = kapasitasMesin;
    }

    // Setter dan Getter
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Overriding method info
    @Override
    public String info() {
        return "Mobil Merk: " + merk + ", Kecepatan Maksimal: " + kecepatan + " km/jam, Kapasitas Mesin: " + kapasitasMesin + " CC";
    }
}
