//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class Animal
//Tanggal   : 1 Juni 2024

abstract class Animal {
    public abstract void eat();
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
