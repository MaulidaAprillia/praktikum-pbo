/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaswajib;

/**
 *
 * @author HP
 */

/*
Nama      : Maulida Aprillia Cinta Ariyatin
NIM       : 24060122120029
Deskripsi : kelas Senjata
Tanggal   : 3 Mei 2024

*/
public class Senjata {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public boolean isMenusuk(){
        return menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
}
