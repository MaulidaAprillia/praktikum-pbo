//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
//Tanggal   : 23 Maret 2024

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
