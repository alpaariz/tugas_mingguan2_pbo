public abstract class BahanPokok {
    String barang;
    String kategori;
    int kode_Produk;

    public int Hitung(int harga) {
        System.out.println("-");
        return 0;
    }
    public int Jenis_Barang(){
        System.out.println("-");
        return 0;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getKode_Produk() {
        return kode_Produk;
    }

    public void setKode_Produk(int kode_Produk) {
        this.kode_Produk = kode_Produk;
    }

    public abstract int Jenis_BahanPokok();
}

