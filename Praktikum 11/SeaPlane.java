//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class SeaPlane
//Tanggal   : 1 Juni 2024

class SeaPlane extends Airplane {
    private double maxLoad;
    public SeaPlane(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    public double getmaxLoad(){
        return maxLoad;
    }
    @Override
    public void takeOff() {
        System.out.println("SeaPlane take off");
    }
    @Override
    public void land() {
        System.out.println("SeaPlane land");
    }
    @Override
    public void fly() {
        System.out.println("SeaPlane fly");
    }

    @Override
    public double calcFuelEfficiency() {
        return 0; 
    }

    @Override
    public double calcTripDistance() {
        return 0; 
    }
}