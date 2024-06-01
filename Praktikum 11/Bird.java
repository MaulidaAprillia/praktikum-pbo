//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class Bird
//Tanggal   : 1 Juni 2024

class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Bird takes off");
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

    @Override
    public void eat() {
        System.out.println("Makanan Burung");
    }
}
