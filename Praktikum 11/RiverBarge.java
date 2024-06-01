//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class RiverBarge
//Tanggal   : 1 Juni 2024

class RiverBarge extends Vehicle{
    private double maxLoad;
    
    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getmaxLoad(){
        return maxLoad;
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
