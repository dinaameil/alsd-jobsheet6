public class Dosen {
        String kode;
        String nama;
        String jenisKelamin;
        int usia;
    
    public Dosen(String kd, String name, String jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }
    
    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Usia: " + usia);
    }

}
