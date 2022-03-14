public class Baju extends Pakaian{
    public char kodeWarna = 'U';
    public void tampilInformasiBaju(){
        System.out.println("ID Baju: " + getID());
        System.out.println("Keterangan: " + getKeterangan());
        System.out.println("Kode Warna: " + kodeWarna);
        System.out.println("Harga baju: " + getHarga());
        System.out.println("Jumlah stok: " + getJmlStock());
    }
 
    public static void main(String[] args){
        Baju batik = new Baju();
        Baju kemeja = new Baju();
 
        batik.setKeterangan("Baju asli Indonesia");
        batik.setJmlStock(70);
        batik.setHarga(120000.0);
        batik.tampilInformasiBaju();
 
        kemeja.setKeterangan("Baju Formal");
        kemeja.setJmlStock(20);
        kemeja.setHarga(60000.0);
        kemeja.tampilInformasiBaju();
    }
}

