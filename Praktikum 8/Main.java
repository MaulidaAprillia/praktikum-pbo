//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Mengubah ke Bahasa java soal 10b tetang Generic
//Tanggal   : 10 Mei 2024

class Kupu {
    void gerak(){

    }
}
class Ulat extends Kupu {
    void gerak(){
        System.out.println("ulat merayap");
    }
}
class Kepompong extends Kupu {
    void gerak(){
        System.out.println("kepompong diam");
    }
}
class KupuDewasa extends Kupu{
    void gerak(){
        System.out.println("kupu terbang");
    }
}

class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }
    public void setIsi(T x){
        this.isi = x;
    }
}

public class Main {
    // Kamus
    // K : Ulat
    // anu : Data<Kupu>
    public static void main(String[] args) {
        Data<Kupu> anu;
        anu = new Data<>();
        anu.setIsi(new Ulat());
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}