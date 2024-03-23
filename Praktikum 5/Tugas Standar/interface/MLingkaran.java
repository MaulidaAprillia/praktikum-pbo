//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Implementasi cara menghitung luas lingkaran
//Tanggal   : 23 Maret 2024

//import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        // Scanner scan1;
        // double jejari;
        // Lingkaran luas;

        // scan1 = new Scanner(System.in);
        // System.out.print("Masukkan jejari lingkaran 1 : ");
        // jejari = scan1.nextDouble();
        // luas = new Lingkaran(jejari);

        // System.out.println("Luas lingkaran 1 adalah " +luas.hitungLuas());

        // scan1.close();

        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan" + "jejari 10.2 satuan adalah " + l.hitungLuas());

        Lingkaran l2 = new Lingkaran(4);
        System.out.println("Luas lingkaran dengan" + "jejari 4 satuan adalah " + l2.hitungLuas());
    }
}
