import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input Data Mobil");
        System.out.print("Masukkan merk mobil: ");
        String merkMobil = scanner.nextLine();
        System.out.print("Masukkan kecepatan maksimal mobil (km/jam): ");
        int kecepatanMobil = scanner.nextInt();
        System.out.print("Masukkan kapasitas mesin mobil (CC): ");
        int kapasitasMesinMobil = scanner.nextInt();
        scanner.nextLine();

        Mobil mobil = new Mobil(merkMobil, kecepatanMobil, kapasitasMesinMobil);


        System.out.println("\nInput Data Motor");
        System.out.print("Masukkan merk motor: ");
        String merkMotor = scanner.nextLine();
        System.out.print("Masukkan kecepatan maksimal motor (km/jam): ");
        int kecepatanMotor = scanner.nextInt();
        System.out.print("Masukkan kapasitas mesin motor (CC): ");
        int kapasitasMesinMotor = scanner.nextInt();
        scanner.nextLine();

        Motor motor = new Motor(merkMotor, kecepatanMotor, kapasitasMesinMotor);


        System.out.println("\nInput Data Truk");
        System.out.print("Masukkan bahan bakar truk: ");
        String bahanBakar = scanner.nextLine();
        System.out.print("Masukkan kapasitas muatan truk (ton): ");
        int kapasitasMuatan = scanner.nextInt();

        Truk truk = new Truk(bahanBakar, kapasitasMuatan);


        System.out.println("\nHasil Input:");
        System.out.println(mobil.info());
        System.out.println(motor.info());
        System.out.println(truk.jenisMesin());


        System.out.print("\nMasukkan merk baru untuk mobil: ");
        scanner.nextLine();
        String merkBaru = scanner.nextLine();
        mobil.setMerk(merkBaru);
        System.out.println("Mobil baru merk: " + mobil.getMerk());

        scanner.close();
    }
}
