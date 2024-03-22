//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : driver class untuk orang, mahasiswa, dan walimahasiswa
//Tanggal   : 20 Maret 2024

package org.main;

import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Wibowo", "123456789", "08123456789", "Jalan Tembalang 20");
        WaliMahasiswa wali2 = new WaliMahasiswa("Supratman", "122256711", "08512345678", "Jalan Tembalang 2");
        Mahasiswa mahasiswa = new Mahasiswa("Maulida Aprillia Cinta Ariyatin","987654321", "24060122120029", "Informatika", wali1);
        
        System.out.println();
        mahasiswa.cetak(); 
        System.out.println("=======================================");
        wali2.cetak();
        wali1.cetak();
    }
}
