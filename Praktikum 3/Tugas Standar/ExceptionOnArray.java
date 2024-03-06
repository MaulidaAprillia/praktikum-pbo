//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program penggunaan eksepsi menggunakan class library java
//Tanggal   : 6 Maret 2024

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
            System.out.println(arrayInteger[2]);
        } 
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            //System.out.println("index error");
        } catch(Exception exception){
            System.out.println("error umum");
        }
        finally {
            System.out.println("Clean up code....");
        }

        System.out.println("test");
    }
}
