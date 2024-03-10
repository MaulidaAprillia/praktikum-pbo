//Nama      : Maulida Aprillia Cinta Ariyatin
//NIM       : 24060122120029
//Deskripsi : Program representasi Product dan penggunaan asersi
//Tanggal   : 8 Maret 2024

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product(){
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock , int price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getStock(){
        return stock;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        assert !name.isEmpty() : " Nama tidak boleh kosong" ;
        this.name = name;
        //TODO : Tambahkan kode untuk set atribut name dan
        //berikan asersi jika name yang dimasukkan berupa string kosong
    }

    public void setStock(int stock){
        assert stock > 0 : " Stock harus bilangan positif" ;
        this.stock = stock;
        //TODO : Tambahkan kode untuk set atribut stock dan
        // berikan asersi bahwa jumlah stock yang dimasukkan harus
        // bilangan positif
    }

    public void setPrice(int price){
        assert price > 0 : " Price harus bilangan positif" ;
        this.price = price;
        //TODO : Tambahkan kode untuk set atribut price dan berikan asersi bahwa jumlah stok yang dimasukkan harus
        //bilangan positif
    }

    public void purchaseProduct(int quantity) {
        assert quantity > 0 : " Quantity harus bilangan positif";
        assert quantity <= stock : " Stock produk yang tersedia tidak mencukupi";
        stock -= quantity;
        // TODO : Tambahkan kode untuk mengurangi stok produk
        //jika dilakukan pembelian. Berikan asersi dimana quantity yang
        //dimasukkan harus bilangan positif dan berikan juga asersi
        //jika stok produk yang tersedia tidak mencukupi.
    }

    public void addStock(int quantity) {
        assert quantity > 0 : " Quantity harus bilangan positif";
        stock += quantity;
        // TODO : Tambahkan kode untuk menambah stok produk.
        //Berikan asersi dimana quantity yang dimasukkan harus bilangan
        //positif
    }
        
}