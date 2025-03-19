import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumlah);
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();
            
            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        
        System.out.println("\nData Mahasiswa sebelum sorting:");
        list.tampil();
        
        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();
        
        input.close();
    }
}