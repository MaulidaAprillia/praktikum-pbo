//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
//Tanggal   : 6 Maret 2024


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException(); //buat objek
        }
        System.out.println(angka+ " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            //as.cobaAngka(10);
            as.cobaAngka(13);
            //as.cobaAngka(12);
        } catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

//jawaban dari pertanyaan :
// ketika eksepsi terjadi pada baris 12(soal) -> System.out.println(angka+ " bukan angka sial");
// tidak di eksekusi karena eksekusi method berhenti sebelum mencapai baris ini
// , cobaAngka bernilai 13 yang dimana masuk kondisi if(angka==13) maka yang dieksekusi baris sebelum baris 12 
// isi dari kondisi if angka==13 (baris 10) yang method ini dilempar ke AngkaSialException, baris sebelumnya ini (baris 10) yang dieksekusi dan eksekusi method berhenti di baris sebelumnya ini.

// Baris 21 -> } catch(AngkaSialException ase){ disini akan dieksekusi karena eksepsi
// AngkaSialException dilempar dan blok catch ini menangkap eksepsi ini.
