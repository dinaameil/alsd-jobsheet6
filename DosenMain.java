import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    String jk;
                    while (true) {
                        System.out.print("Masukkan jenis kelamin (Pria/Wanita): ");
                        jk = sc.nextLine().trim();

                        if (jk.equalsIgnoreCase("Pria") || jk.equalsIgnoreCase("Wanita")) {
                            break;
                        } else {
                            System.out.println("Input tidak valid! Masukkan 'Pria' atau 'Wanita'.");
                        }
                    }

                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    data.tambah(new Dosen(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan (ASCENDING)");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan (DESCENDING)");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        sc.close();
    }
}
