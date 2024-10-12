public class Truk extends Mesin {
    private int kapasitasMuatan; // dalam ton

    // Overloading Constructor
    public Truk(String bahanBakar, int kapasitasMuatan) {
        super(bahanBakar);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    // Setter dan Getter
    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    // Overriding method jenisMesin
    @Override
    public String jenisMesin() {
        return "Truk dengan bahan bakar: " + bahanBakar + ", Kapasitas Muatan: " + kapasitasMuatan + " ton";
    }
}
