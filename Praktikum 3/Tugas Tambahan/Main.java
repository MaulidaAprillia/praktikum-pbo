//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program penggunaan eksepsi
//Tanggal   : 8 Maret 2024

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        // TODO 4: Buat implementasi try-catch untuk
        // handling exception pada saat melakukan peminjaman buku
        // Buat dua block catch: ketika anggota sudah
        ///meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam

        //Instansiasi objek buku
        Buku buku1 = new Buku("HTMl dan CSS");
        Buku buku2 = new Buku("CSS for dummies");
        Buku buku3 = new Buku("Harry Potter");

        //Instansiasi objek anggota
        Anggota anggota1 = new Anggota("Maulida Aprillia Cinta Ariyatin");
        //Anggota anggota2 = new Anggota("Jang Wonyoung");
        try {
            //menambah anggota di dalam blok try
            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
            //anggota2.pinjamBuku(buku1);
            anggota1.pinjamBuku(new Buku("Belajar Algoritma")); 

        } catch (MaksimumBukuTerpinjamException exc) {
            System.out.println(exc.getMessage()); 
        } catch (BukuTidakTersediaException exc) {
            System.out.println(exc.getMessage()); 
        }

    
    }
}
