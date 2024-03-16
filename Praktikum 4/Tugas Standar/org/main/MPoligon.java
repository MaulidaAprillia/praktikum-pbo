//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi :  driver class untuk poligon persegi panjang dan segitiga
//Tanggal   : 16 Maret 2024

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 5, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " +persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(2, 3, 4);
        segitiga.printInfo();;
        System.out.println("Luas Segitiga : " +segitiga.hitungLuas());
    }
}
