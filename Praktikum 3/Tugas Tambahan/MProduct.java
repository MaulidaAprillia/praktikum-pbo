//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program representasi main Product dan penggunaan asersi
//Tanggal   : 8 Maret 2024

public class MProduct {
    public static void main(String[] args) {
        //Product product = new Product("Laptop", -4, -500);
        Product product = new Product();
        product.setName("Laptop");
        product.setStock(4); 
        product.setPrice(500);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(5);
        System.out.println("Product Stock: " + product.getStock());
        }
        
}
