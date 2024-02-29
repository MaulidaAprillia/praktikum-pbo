//Nama : Maulida Aprillia Cinta Ariyatin
//NIM : 24060122120029
//Deskripsi : Representasi Garis
//Tanggal : 28 Februari 2024

public class MGaris {
    public static void main(String[] args){
        Garis garis1 = new Garis(new Titik(1,1), new Titik(1,4));

        System.out.println("------Garis 1------");
        System.out.println("Titik Awal Garis1 : ("+ garis1.getTitikAwal().getAbsis()+", "+garis1.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik Akhir Garis1 : ("+ garis1.getTitikAkhir().getAbsis()+", "+garis1.getTitikAkhir().getOrdinat()+")");
        System.out.println("Panjang Garis1: " + garis1.getPanjang());
        System.out.println("Gradien Garis1: " + garis1.getGradien());

        System.out.println("------Garis 2------");
        System.out.println("Garis 2 adalah garis1 yang direfleksikan ke sumbu Y");
        Garis garis2 = garis1.getRefleksiY();
        System.out.println("Titik Awal Garis 2 : (" + garis2.getTitikAwal().getAbsis() + ", " + garis2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir Garis 2 : (" + garis2.getTitikAkhir().getAbsis() + ", " + garis2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("------Garis 3------");
        Garis garis3 = new Garis(new Titik(4, 5), new Titik(8, 5));
        System.out.println("Titik Awal Garis3 : ("+ garis3.getTitikAwal().getAbsis()+", "+garis3.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik Akhir Garis3 : ("+ garis3.getTitikAkhir().getAbsis()+", "+garis3.getTitikAkhir().getOrdinat()+")");
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 3? " + garis1.isTegakLurus(garis3));
    }
}
