//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : class Airport
//Tanggal   : 1 Juni 2024

class AirPort {
    private Airplane airplane;
    private String name;
    
    public AirPort(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Airplane getAirPlane(){
        return airplane;
    }
    public void givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            System.out.println("Permission granted to land");
        } else {
            System.out.println("Permission denied to land");
        }
    }
}
