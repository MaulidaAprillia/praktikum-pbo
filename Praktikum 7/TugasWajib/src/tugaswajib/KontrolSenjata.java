/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaswajib;

/**
 *
 * @author HP
 */

/*
Nama      : Maulida Aprillia Cinta Ariyatin
NIM       : 24060122120029
Deskripsi : kelas KontrolSenjata
Tanggal   : 3 Mei 2024

*/
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    }
    public void isiPeluru(int jumPeluru){
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);   
    }
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        if (isAdaPeluru()) {
            int tembakan = Math.min(jumlah, senjata.getPeluru());
            for (int i = 0; i < tembakan; i++) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            }
            for (int i = 0; i < jumlah - tembakan; i++) {
            System.out.println("Gagal tembak, Peluru Habis");
        }
        } else {
            System.out.println("Gagal tembak, Peluru Habis");
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    public void menusuk(){
        senjata.setMenusuk(true);
        System.out.println("Jleb!");
    }
}
