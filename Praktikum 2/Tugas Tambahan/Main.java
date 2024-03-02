//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Representasi Main Mahasiswa dan WaliMahasiwa
//Tanggal   : 1 Maret 2024

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali = new WaliMahasiswa("Wibowo", "08123456789", "Jalan Tembalang 20");
        Mahasiswa mahasiswa = new Mahasiswa("Maulida Aprillia Cinta Ariyatin", "24060122120029", "Informatika", wali);
        mahasiswa.cetak();
    }
}
