//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class Helicopter
//Tanggal   : 1 Juni 2024

class Helicopter extends Airplane{
    private double maxLoad;
    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    public double getmaxLoad(){
        return maxLoad;
    }
    @Override
    public void takeOff() {
        System.out.println("Helicopter take off");
    }
    @Override
    public void land() {
        System.out.println("Helicopter land");
    }
    @Override
    public void fly() {
        System.out.println("Helicopter fly");
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
