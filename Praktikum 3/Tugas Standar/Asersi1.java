//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program untuk menunjukkan asersi
//Tanggal   : 6 Maret 2024

public class Asersi1{
    public static void main(String[] args){
        int x=-1;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else {
            assert(x>0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}