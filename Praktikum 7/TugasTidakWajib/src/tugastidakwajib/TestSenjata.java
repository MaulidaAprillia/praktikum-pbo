/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugastidakwajib;

/**
 *
 * @author HP
 */

/*
Nama      : Maulida Aprillia Cinta Ariyatin
NIM       : 24060122120029
Deskripsi : Implementasi kelas Senjata
Tanggal   : 3 Mei 2024

*/
public class TestSenjata {
    
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata ml6 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
        
        
        System.out.println("\n");
        System.out.println("Jumlah Peluru ML6: " + ml6.getPeluru());
        System.out.println("ML6 mengisi peluru");
        ml6.setPeluru(10);
        System.out.println("Jumlah Peluru ML6: " + ml6.getPeluru());

        System.out.println("ML6 menembak");
        ml6.menembak();
        
    }
}
