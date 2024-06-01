//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class Superman
//Tanggal   : 1 Juni 2024

class Superman extends Kryptonian {
    private String name;
    public Superman(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void takeOff() {
        System.out.println("Superman take off");
    }
    public void land() {
        System.out.println("Superman land");
    }
    public void fly() {
        System.out.println("Superman fly");
    }
    public void leapBuilding() {
        System.out.println("Superman leaps building");
    }
    public void stopBullet() {
        System.out.println("Superman stops bullet");
    }
}