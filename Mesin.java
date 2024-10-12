public class Mesin {
    protected String bahanBakar;

    // Overloading Constructor
    public Mesin() {
        this("Bensin");
    }

    public Mesin(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    // Setter dan Getter
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    // Method yang bisa di override
    public String jenisMesin() {
        return "Mesin menggunakan bahan bakar: " + bahanBakar;
    }
}
