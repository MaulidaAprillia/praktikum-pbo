//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Representasi Mahasiswa
//Tanggal   : 1 Maret 2024

public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali ; 

    public Mahasiswa(String nama, String nim, String jurusan , WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }
    
    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("----Mahasiswa----");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Wali Mahasiswa : ");
        System.out.println("Nama : " + wali.getNama());
        System.out.println("Nomor HP : " + wali.getNomorHP());
        System.out.println("Alamat : " + wali.getAlamat());
    }
}