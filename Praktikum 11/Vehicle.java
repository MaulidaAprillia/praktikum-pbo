//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class abstract Vehicle
//Tanggal   : 1 Juni 2024

abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
    //@Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
