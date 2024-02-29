//Nama : Maulida Aprillia Cinta Ariyatin
//NIM : 24060122120029
//Deskripsi : Representasi Garis
//Tanggal : 28 Februari 2024

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static double counterGaris;
    
    //konstruktor
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    
    //method getter dan setter
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    static double getCounterGaris(){
        return counterGaris;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        double dX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dX * dX + dY * dY);
    }

    public double getGradien(){
        double gradien = (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
                (titikAkhir.getAbsis() - titikAwal.getAbsis());
        return gradien;
    }

    public Garis getRefleksiY(){
        Titik newTitikAwal = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
        Titik newTitikAkhir = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        return new Garis(newTitikAwal, newTitikAkhir);
    }

    public boolean isTegakLurus(Garis G){
        if (Math.abs(this.getGradien()) == Double.POSITIVE_INFINITY || Math.abs(G.getGradien()) == Double.POSITIVE_INFINITY) {
            return false;
        }
        else {
            return Math.abs(this.getGradien() * G.getGradien() + 1) < 0.0001;
        }

    
    }
} 
