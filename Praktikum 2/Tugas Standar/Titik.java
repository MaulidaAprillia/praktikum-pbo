//Nama : Maulida Aprillia Cinta Ariyatin
//NIM : 24060122120029
//Deskripsi : Representasi Titik
//Tanggal : 28 Februari 2024

//Prak 2
public class Titik{
    //atribut
    private float absis;
    private float ordinat;

    private static float counterTitik;

    public Titik(){
        absis = 0;
        ordinat= 0;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }

    public void setOrdinat(float a){
        ordinat = a;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float)Math.sqrt(Math.pow(absis, 2) + ordinat*ordinat);
    }

    public void refleksiX(){
        this.ordinat= -(this.ordinat);
    }
    public void refleksiY(){
        this.absis= (this.absis)*(-1);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -(this.ordinat));
    }

    public Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }
    public Titik(float newAbsis, float newOrdinat){
        absis = newAbsis;
        ordinat = newOrdinat;
        counterTitik++;
    }
}