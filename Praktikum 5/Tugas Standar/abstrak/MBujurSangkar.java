//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
//Tanggal   : 23 Maret 2024

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+" satuan adalah 8"+bs.hitungLuas(sisi));

        scan.close();
    }
}
