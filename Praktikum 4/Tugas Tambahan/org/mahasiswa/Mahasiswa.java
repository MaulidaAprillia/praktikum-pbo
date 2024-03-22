//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : representasi dasar dari objek mahasiswa, turunan kelas orang
//Tanggal   : 20 Maret 2024

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali ; 

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
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
        System.out.println("Nik : " + nik);
        System.out.println("Nim : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Wali Mahasiswa : ");
        System.out.println("Nama : " + wali.getNama());
        System.out.println("Nik : " + wali.getNik());
        System.out.println("Nomor HP : " + wali.getNomorHp());
        System.out.println("Alamat : " + wali.getAlamat());
    }
}