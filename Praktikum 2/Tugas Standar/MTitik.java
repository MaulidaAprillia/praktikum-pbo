//Nama : Maulida Aprillia Cinta Ariyatin
//NIM : 24060122120029
//Deskripsi : Representasi Titik
//Tanggal : 28 Februari 2024

public class MTitik {

    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        

        float counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik: " + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        System.out.println("t1("+absis+", "+ordinat+")");

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);
        

        absis = t3.getAbsis();
        ordinat = t3.getOrdinat();
        System.out.println("t3("+absis+", "+ordinat+")");

        System.out.println("Jarak titik t1 terhadap titik pusat : " + t1.getJarakPusat());

        t3.refleksiX();
        t3.refleksiY();
        System.out.println("Titik t3 setelah  sekarang : ("+ t3.getAbsis()+","+t3.getOrdinat()+")");

        Titik t4 = t2.getRefleksiX();
        System.out.println("Refleksi x(t2) : ("+ t4.getAbsis()+", "+t4.getOrdinat()+")");

        Titik t5 = t1.getRefleksiY();
        System.out.println("Refleksi x(t1) : ("+ t5.getAbsis()+", "+t5.getOrdinat()+")");

        
        // Kesimpulan : enkapsulasi telah dilakukan di kelas titik pertemuan 2 seperti memodifikasi akses atribut-atribut dan method2 nya diubah
        // private dan public. Hal yang dimanipulasi disini melalui berbagai method getJarakPusat ~ getRefleksiY.
        // enkapsulasi disini untuk menjaga rahasia di dalam kelas. Jadi yang dilakukan membuat atribut-atribut jadi lebih pribadi seperti agar
        // hanya bisa diakses kelas itu sendiri, ini juga dapat melindungi data, lebih membuat kode dimengerti, dapat juga merubah internal kelas tanpa harus mempengaruhi kode luar kelas


    }
} 