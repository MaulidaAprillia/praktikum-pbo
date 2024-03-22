//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : representasi dasar dari objek walimahasiswa, turunan kelas orang
//Tanggal   : 20 Maret 2024

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHp = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        System.out.println("----Wali Mahasiswa----");
        System.out.println("Nama : " + nama);
        System.out.println("Nik : " + nik);
        System.out.println("Nomor HP : " + nomorHp);
        System.out.println("Alamat : " + alamat);
    }
}
